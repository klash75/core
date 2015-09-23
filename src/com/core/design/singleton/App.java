package com.core.design.singleton;

/**
 * Created by klash75 on 9/23/2015.
 */
public class App {

    public static void main(String[] args) {
        //eagerly initialized singleton
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        IvoryTower ivoryTower2 = IvoryTower.getInstance();
        System.out.println("ivoryTower1 = " + ivoryTower1);
        System.out.println("ivoryTower2 = " + ivoryTower2);

        //lazily initialized singleton
        ThreadSafeLazyLoadedIvoryTower threadSafeLazyLoadedIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower threadSafeLazyLoadedIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        System.out.println("threadSafeLazyLoadedIvoryTower1 = " + threadSafeLazyLoadedIvoryTower1);
        System.out.println("threadSafeLazyLoadedIvoryTower2 = " + threadSafeLazyLoadedIvoryTower2);

        //enum singleton
        EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
        System.out.println("enumIvoryTower1 = " + enumIvoryTower1);
        System.out.println("enumIvoryTower2 = " + enumIvoryTower2);

        InitializingOnDemandHolderIdiom demandHolderIdiom = InitializingOnDemandHolderIdiom.getInstance();
        System.out.println(demandHolderIdiom);
        InitializingOnDemandHolderIdiom demandHolderIdiom1 = InitializingOnDemandHolderIdiom.getInstance();
        System.out.println(demandHolderIdiom1);

        ThreadSafeDoubleCheckLocking doubleCheckLocking = ThreadSafeDoubleCheckLocking.getInstance();
        System.out.println(doubleCheckLocking);
        ThreadSafeDoubleCheckLocking doubleCheckLocking1 = ThreadSafeDoubleCheckLocking.getInstance();
        System.out.println(doubleCheckLocking1);
    }
}
