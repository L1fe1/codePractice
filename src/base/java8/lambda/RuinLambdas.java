package base.java8.lambda;

public class RuinLambdas {
    public static void main(String[] args) {
        // Easy
        startDream(new Dream() {
            @Override public void dream() {
                // Dream boy, dream ...
            }
        });

        startDream(new AugmentedDream() {
            @Override public void dream(String dreamName) {
                // Dream boy, dream ...
            }
        });

        // Less easy
        startDream(() -> { /* Dream boy, dream ... */ });

        // And now kid ? ...
        startDream((dreamName) -> { /* Dream boy, dream ... */ });

        // Do you see which one it is directly by reading this ? ...
        startDream((dreamName, duration) -> { /* Dream boy, dream ... */ });
    }

    public static void startDream(Dream md) { md.dream(); }

    public static boolean startDream(AugmentedDream ad) {
        ad.dream("Ruin lambdas");
        return true;
    }

    public static boolean startDream(ThisIsNightmare hahaha) {
        hahaha.sufferMyKid("Hahaha you're going to hell", 2000);
        return false;
    }
}

interface Dream {
    void dream();
}

interface AugmentedDream {
    void dream(String dreamName);
}

interface ThisIsNightmare {
    void sufferMyKid(String dreamName, int duration);
}
