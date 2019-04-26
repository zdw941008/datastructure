package demo10;

import java.util.*;

/**
 * Created by zdw
 * 2019-04-25 16:19.
 */
public class TestHuffmanCode {

    //用于临时存储路径
    static StringBuilder sb = new StringBuilder();
    //用于存储赫夫曼编码
    static Map<Byte,String> huffCodes = new HashMap<>();

    public static void main(String[] args) {
        String msg = "can you can a can as a can canner can a can";
        byte[] bytes =  msg.getBytes();
        //进行赫夫曼编码
        byte[] b = huffmanZip(bytes);
        //使用赫夫曼编码进行解码
        byte[] newBytes = decode(huffCodes,b);

        System.out.println(new String(newBytes));


//        System.out.println(Arrays.toString(bytes));
//        System.out.println(Arrays.toString(newBytes));


    }

    /**
     * 使用指定的赫夫曼编码表进行解码
     * @param huffCodes
     * @param b
     * @return
     */
    private static byte[] decode(Map<Byte, String> huffCodes, byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        //把byte数组转为一个二进制的字符串
        for(int i=0;i<bytes.length;i++){
            byte b = bytes[i];
            //是否是最后一个
            boolean flag = (i==bytes.length-1);
            sb.append(byteToBitStr(!flag,b));
        }
        System.out.println(sb.toString());
        //把字符串按照指定的赫夫曼编码进行解码
        //把赫夫曼编码的键值对进行调换
        Map<String,Byte> map = new HashMap<>();
        for (Map.Entry<Byte, String> entry : huffCodes.entrySet()) {
            map.put(entry.getValue(),entry.getKey());
        }

        //创建一个集合，用于存byte
        List<Byte> list = new ArrayList<>();
        //处理字符串
        for (int i = 0; i < sb.length();) {
            int count =1;
            boolean flag = true;
            Byte b = null;
            //截取出一个byte
            while (flag) {
                String key = sb.substring(i,i+count);
                b = map.get(key);
                if (b==null) {
                    count++;
                }else {
                    flag=false;
                }
            }
            System.out.println(b);
            list.add(b);
            i+=count;
        }
        //把集合转为数组
        byte[] b = new byte[list.size()];
        for (int i = 0; i < b.length; i++) {
            b[i] = list.get(i);
        }

        return b;
    }

    private static String byteToBitStr(boolean flag,byte b){
        int temp = b;

        if (flag) {
            temp|=256;
        }
        String str = Integer.toBinaryString(temp);
        if (flag) {
            return str.substring(str.length()-8);
        }else {
            return str;
        }
    }



    /**
     * 进行赫夫曼编码压缩的方法
     * @param bytes
     * @return
     */
    private static byte[] huffmanZip(byte[] bytes) {
        //先统计每一个byte出现的次数，并放入集合中
        List<Node> nodes = getNodes(bytes);
        //创建一颗赫夫曼树
        Node tree = createHuffmanTree(nodes);
        //创建一个赫夫曼编码表
        Map<Byte,String> huffCodes = getCodes(tree);
        //编码
        byte[] b = zip(bytes,huffCodes);
        return b;
    }

    private static byte[] zip(byte[] bytes, Map<Byte, String> huffCodes) {
        StringBuilder sb = new StringBuilder();
        //把需要压缩的byte数组处理成一个二进制的字符串
        for(byte b:bytes) {
            sb.append(huffCodes.get(b));
        }
        //定义长度
        int len;
        if(sb.length()%8==0) {
            len=sb.length()/8;
        }else {
            len=sb.length()/8+1;
        }
        //用于存储压缩后的byte
        byte[] by = new byte[len];
        //记录新byte的位置
        int index = 0;
        for(int i=0;i<sb.length();i+=8) {
            String strByte;
            if(i+8>sb.length()) {
                strByte = sb.substring(i);
            }else {
                strByte = sb.substring(i, i+8);
            }
            byte byt = (byte)Integer.parseInt(strByte, 2);
            by[index]=byt;
            index++;
        }
        return by;
    }

    /**
     * 根据赫夫曼树获取赫夫曼编码
     * @param tree
     * @return
     */
    private static Map<Byte,String> getCodes(Node tree){
        if (tree == null) {
            return null;
        }
        getCodes(tree.left,"0",sb);
        getCodes(tree.right,"1",sb);
        return huffCodes;
    }

    private static void getCodes(Node node,String code,StringBuilder sb){
        StringBuilder sb2 = new StringBuilder(sb);
        sb2.append(code);
        if (node.data==null) {
            getCodes(node.left,"0",sb2);
            getCodes(node.right,"1",sb2);
        }else {
            huffCodes.put(node.data,sb2.toString());
        }

    }



    /**
     * 创建赫夫曼树
     * @param nodes
     * @return
     */
    private static Node createHuffmanTree(List<Node> nodes){
        while (nodes.size()>1) {
            //排序
            Collections.sort(nodes);
            //取出两个权值最低的二叉树
            Node left = nodes.get(nodes.size()-1);
            Node right = nodes.get(nodes.size()-2);
            //创建一颗新的二叉树
            Node parent = new Node(null,left.weight+right.weight);
            //把之前取出来的两颗二叉树设置为新创建的二叉树的子树
            parent.left=left;
            parent.right=right;
            //把前面取出来的两颗二叉树删除
            nodes.remove(left);
            nodes.remove(right);
            //把新创建的二叉树放入集合中
            nodes.add(parent);
        }
        System.out.println(nodes);
        return nodes.get(0);
    }







    /**
     * 把byte数组转为node集合
     * @param bytes
     * @return
     */
    private static List<Node> getNodes(byte[] bytes) {
        List<Node> nodes = new ArrayList<>();
        //存储每一个byte出现了多少次
        Map<Byte,Integer> counts = new HashMap<>();
        //统计每一个byte出现的次数
        for (byte b : bytes) {
            Integer count = counts.get(b);
            if (count==null) {
                counts.put(b,1);
            }else {
                counts.put(b,count+1);
            }
        }
        //把每一个键值对转为一个node对象
        for (Map.Entry<Byte, Integer> entry : counts.entrySet()) {
            nodes.add(new Node(entry.getKey(),entry.getValue()));
        }
        return nodes;
    }


}
