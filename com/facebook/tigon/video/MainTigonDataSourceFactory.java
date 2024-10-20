package com.facebook.tigon.video;

import X.0fH;
import X.1BQ;
import X.1BV;
import X.5Ma;
import X.C00i;
import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: MainTigonDataSourceFactory.class */
public final class MainTigonDataSourceFactory extends 5Ma {
    public static MainTigonDataSourceFactory A08;
    public static final String A09 = MainTigonDataSourceFactory.class.toString();
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public ScheduledExecutorService A04;
    public final C00i A05;
    public final C00i A06;
    public final Context A07;

    public MainTigonDataSourceFactory() {
    }

    public MainTigonDataSourceFactory(Context context) {
        this.A06 = new 1BQ(66070);
        this.A05 = new 1BQ(32853);
        this.A07 = context;
        this.A04 = Executors.newScheduledThreadPool(1);
        this.A03 = new 1BQ(66071);
        this.A02 = new 1BQ(99934);
        this.A01 = new 1BV(context, 32865);
        this.A00 = new 1BQ(32856);
    }

    public static MainTigonDataSourceFactory A00(Context context) {
        MainTigonDataSourceFactory mainTigonDataSourceFactory;
        synchronized (MainTigonDataSourceFactory.class) {
            try {
                if (A08 == null) {
                    try {
                        String str = A09;
                        0fH.A0j(str, "LigerVideo TigonDataSourceFactory createTigonDataSourceFactory");
                        A08 = new MainTigonDataSourceFactory(context);
                        0fH.A0j(str, "LigerVideo TigonDataSourceFactory createTigonDataSourceFactory finished");
                    } catch (Exception e) {
                        0fH.A0y(A09, "LigerVideo TigonDataSourceFactory createTigonDataSourceFactory exception: %s.", e, new Object[]{e.getMessage()});
                    }
                }
                mainTigonDataSourceFactory = A08;
            } finally {
            }
        }
        return mainTigonDataSourceFactory;
    }
}
