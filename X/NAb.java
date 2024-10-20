package X;

import com.facebook.mobileconfig.troubleshooting.BisectCallback;

/* loaded from: NAb.class */
public interface NAb {
    boolean goBackOneStep();

    void startBisection(String str, BisectCallback bisectCallback);

    boolean stopBisection();

    boolean userDidNotReproduceBug();

    boolean userDidReproduceBug();
}
