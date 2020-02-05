package sjms.template;

/**
 * Created by zdw
 * 2019-11-12 14:22.
 */
public abstract class ShoeInstallTemplate {

    public abstract void installSole();

    public abstract void installInsole();

    public abstract void installVamp();

    public abstract void installShoelace();

    public void installShot() {
        System.out.println("组装一双鞋，步骤如下：");
        // 组装鞋底
        installSole();
        // 组装鞋垫
        installInsole();
        // 组装鞋面
        installVamp();
        // 组装鞋带
        installShoelace();
    }

}
