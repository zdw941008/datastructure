package sjms.template;

/**
 * Created by zdw
 * 2019-11-12 14:23.
 */
public class AdidasBoostShoeInstall extends ShoeInstallTemplate {
    @Override
    public void installSole() {
        System.out.println("组装白色 Boost 鞋底");
    }

    @Override
    public void installInsole() {
        System.out.println("组装黑色 Boost 鞋垫");
    }

    @Override
    public void installVamp() {
        System.out.println("组装黑色 Boost 鞋面");
    }

    @Override
    public void installShoelace() {
        System.out.println("组装黑色 Boost 鞋带");
    }
}
