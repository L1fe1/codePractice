package base.polymorphic;

public class MethodOverrideVsOverload {

    @Override
    public boolean equals( Object other ) {
        System.out.println("MethodOverrideVsOverload equals method reached" );
        return true;
    }

//    public boolean equals( MethodOverrideVsOverload other ) {
//        System.out.println("MethodOverrideVsOverload equals method reached" );
//        return true;
//    }

    public static void main(String[] args) {
        Object o1 = new MethodOverrideVsOverload();//during compile time o1 is of type Object
                                                   //during runtime o1 is of type MethodOverrideVsOverload
        Object o2 = new MethodOverrideVsOverload();//during compile time o2 is of type Object
                                                   //during runtime o2 is of type MethodOverrideVsOverload
        MethodOverrideVsOverload o3 = new MethodOverrideVsOverload();//o3 is of type MethodOverrideVsOverload during both compile time and runtime
        MethodOverrideVsOverload o4 = new MethodOverrideVsOverload();//o4 is of type MethodOverrideVsOverload during both compile time and runtime

        /**
         * 没有重写Object类的equals方法，所以会调用Object类的equals方法，比较引用地址值
         */
        if(o1.equals(o2)){
            System.out.println("objects o1 and o2 are equal");
        }

        if(o3.equals(o4)){
            System.out.println("objects o3 and o4 are equal");
        }
    }

}
