package X;

import com.facebook.zero.service.ZeroInterstitialEligibilityManager;
import java.util.HashMap;

/* loaded from: G8V.class */
public final class G8V extends HashMap {
    public final /* synthetic */ ZeroInterstitialEligibilityManager this$0;
    public final /* synthetic */ String val$typeName;
    public final /* synthetic */ String val$uri;

    public G8V(ZeroInterstitialEligibilityManager zeroInterstitialEligibilityManager, String str, String str2) {
        this.this$0 = zeroInterstitialEligibilityManager;
        this.val$typeName = str;
        this.val$uri = str2;
        put("optin_type", str);
        put("optin_uri", str2);
    }
}
