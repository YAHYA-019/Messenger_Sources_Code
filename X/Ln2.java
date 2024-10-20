package X;

import android.content.Context;
import android.os.Bundle;
import android.webkit.CookieSyncManager;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.IsUrlSavedCallback;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: Ln2.class */
public final class Ln2 implements Runnable {
    public static final String __redex_internal_original_name = "BrowserLiteCallbacker$3";
    public final /* synthetic */ KeG A00;
    public final /* synthetic */ LDF A01;

    public Ln2(KeG keG, LDF ldf) {
        this.A01 = ldf;
        this.A00 = keG;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2;
        LDF ldf = this.A01;
        int i = 300;
        while (true) {
            try {
                int i2 = i;
                if (ldf.A06 != null) {
                    break;
                }
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                Thread.sleep(10);
                i = i3;
            } catch (InterruptedException unused) {
            }
        }
        BrowserLiteCallback browserLiteCallback = ldf.A06;
        if (browserLiteCallback == null) {
            LCd.A04("BrowserLiteCallbacker", "Callback service is not available.", AnonymousClass001.A1Z());
            0fH.A0o("BrowserLiteCallbacker", "Callback service is not available");
            return;
        }
        try {
            JmP jmP = this.A00;
            if (jmP instanceof JmP) {
                JmP jmP2 = jmP;
                browserLiteCallback.C1E(jmP2.A00, jmP2.A02, jmP2.A03);
                return;
            }
            if (jmP instanceof JmS) {
                JmS jmS = (JmS) jmP;
                browserLiteCallback.CAZ(jmS.A00, jmS.A03, jmS.A01);
                return;
            }
            if (jmP instanceof JmV) {
                JmV jmV = (JmV) jmP;
                browserLiteCallback.CAb(jmV.A02, jmV.A04, jmV.A00, jmV.A01);
                return;
            }
            if (jmP instanceof JmR) {
                JmR jmR = (JmR) jmP;
                browserLiteCallback.CAj(jmR.A00, jmR.A03, jmR.A02);
                return;
            }
            if (jmP instanceof JmY) {
                JmY jmY = (JmY) jmP;
                long[] jArr = jmY.A05;
                if (jArr.length > 0) {
                    browserLiteCallback.Cge(jmY.A00, jArr);
                }
                browserLiteCallback.CAz(jmY.A00, jmY.A02, jmY.A03, jmY.A04);
                return;
            }
            if (jmP instanceof JmQ) {
                JmQ jmQ = (JmQ) jmP;
                browserLiteCallback.CHs(jmQ.A00, jmQ.A02, jmQ.A03);
                return;
            }
            if (jmP instanceof JmX) {
                JmX jmX = (JmX) jmP;
                browserLiteCallback.Bx2(jmX.A00, jmX.A02, jmX.A04, jmX.A03, jmX.A05);
                return;
            }
            if (jmP instanceof C3201Jmc) {
                C3201Jmc c3201Jmc = (C3201Jmc) jmP;
                browserLiteCallback.BaH(c3201Jmc.A07, c3201Jmc.A09, c3201Jmc.A0A, c3201Jmc.A0B, null, null, c3201Jmc.A00, c3201Jmc.A04, c3201Jmc.A05, c3201Jmc.A01, c3201Jmc.A03, c3201Jmc.A02, c3201Jmc.A0D, c3201Jmc.A0F, c3201Jmc.A0E, c3201Jmc.A0C);
                return;
            }
            if (jmP instanceof C3199Jma) {
                C3199Jma c3199Jma = (C3199Jma) jmP;
                if (c3199Jma.A00 != 0) {
                    browserLiteCallback.BZd(c3199Jma.A04, c3199Jma.A05, (java.util.Map) c3199Jma.A03, c3199Jma.A01);
                    return;
                } else {
                    browserLiteCallback.BZe(c3199Jma.A04, c3199Jma.A05, (java.util.Map) c3199Jma.A03, c3199Jma.A01);
                    return;
                }
            }
            if (jmP instanceof JmT) {
                JmT jmT = (JmT) jmP;
                if (jmT.A00 != 0) {
                    browserLiteCallback.BLm(jmT.A02, jmT.A03);
                    return;
                } else {
                    browserLiteCallback.BbR(jmT.A03, jmT.A02);
                    return;
                }
            }
            if (jmP instanceof JmZ) {
                JmZ jmZ = (JmZ) jmP;
                if (jmZ.A00 != 0) {
                    browserLiteCallback.ACb((Bundle) jmZ.A03, (ZonePolicy) jmZ.A04, jmZ.A05, (java.util.Map) jmZ.A02);
                    return;
                } else {
                    browserLiteCallback.BZc((Bundle) jmZ.A03, (ZonePolicy) jmZ.A04, jmZ.A05, (java.util.Map) jmZ.A02);
                    return;
                }
            }
            if (jmP instanceof C3204Jmf) {
                C3204Jmf c3204Jmf = (C3204Jmf) jmP;
                switch (c3204Jmf.A00) {
                    case 0:
                        browserLiteCallback.C1C(c3204Jmf.A03, (List) c3204Jmf.A02);
                        return;
                    case 1:
                        browserLiteCallback.BWz((IsUrlSavedCallback) c3204Jmf.A02, c3204Jmf.A03);
                        return;
                    case 2:
                        browserLiteCallback.Brn(c3204Jmf.A03, (Bundle) c3204Jmf.A02);
                        return;
                    default:
                        browserLiteCallback.C7c(AnonymousClass001.A03(c3204Jmf.A02) != 0 ? "open_page" : AbstractC00603o4.A00(294), c3204Jmf.A03);
                        return;
                }
            }
            if (jmP instanceof JmO) {
                JmO jmO = (JmO) jmP;
                switch (jmO.A00) {
                    case 0:
                        browserLiteCallback.BZy(jmO.A02);
                        return;
                    case 1:
                        browserLiteCallback.BLg(jmO.A02);
                        return;
                    default:
                        browserLiteCallback.BLl(jmO.A02);
                        return;
                }
            }
            if (jmP instanceof C3203Jme) {
                C3203Jme c3203Jme = (C3203Jme) jmP;
                switch (c3203Jme.A00) {
                    case 0:
                        browserLiteCallback.Cge((Bundle) c3203Jme.A03, (long[]) c3203Jme.A02);
                        return;
                    case 1:
                        browserLiteCallback.CT8((Bundle) c3203Jme.A03, (java.util.Map) c3203Jme.A02);
                        return;
                    case 2:
                        browserLiteCallback.Bbi((Bundle) c3203Jme.A03, (java.util.Map) c3203Jme.A02);
                        return;
                    case 3:
                        browserLiteCallback.CWF((Bundle) c3203Jme.A02, (OnShopsLiteCallback) c3203Jme.A03);
                        return;
                    default:
                        browserLiteCallback.C2t((BrowserLiteJSBridgeCall) c3203Jme.A03, (BrowserLiteJSBridgeCallback) c3203Jme.A02);
                        return;
                }
            }
            if (jmP instanceof C3202Jmd) {
                C3202Jmd c3202Jmd = (C3202Jmd) jmP;
                switch (c3202Jmd.A00) {
                    case 0:
                        browserLiteCallback.C9s((java.util.Map) c3202Jmd.A02);
                        return;
                    case 1:
                        browserLiteCallback.BaT((Bundle) c3202Jmd.A02);
                        return;
                    case 2:
                        browserLiteCallback.CWG((Bundle) c3202Jmd.A02);
                        return;
                    case 3:
                        Context context = (Context) c3202Jmd.A02;
                        Pattern pattern = L9d.A01;
                        CookieSyncManager.createInstance(context);
                        try {
                            KVn.A00().flush();
                        } catch (Exception unused2) {
                        }
                        browserLiteCallback.D3v();
                        return;
                    default:
                        browserLiteCallback.AS2((AutofillContactDataCallback) c3202Jmd.A02);
                        return;
                }
            }
            if (jmP instanceof JmN) {
                if (((JmN) jmP).A00 != 0) {
                    browserLiteCallback.CKa();
                    return;
                } else {
                    browserLiteCallback.Bz1();
                    return;
                }
            }
            if (jmP instanceof C3200Jmb) {
                C3200Jmb c3200Jmb = (C3200Jmb) jmP;
                browserLiteCallback.C7d(c3200Jmb.A01, c3200Jmb.A04, c3200Jmb.A02, c3200Jmb.A03, c3200Jmb.A05, c3200Jmb.A06);
            } else if (jmP instanceof JmU) {
                JmU jmU = (JmU) jmP;
                browserLiteCallback.BaG(jmU.A00, jmU.A03, jmU.A02, jmU.A04);
            } else {
                JmW jmW = (JmW) jmP;
                browserLiteCallback.BaO(jmW.A01, jmW.A03, jmW.A04, jmW.A00, jmW.A05);
            }
        } catch (Exception e) {
            KeG keG = this.A00;
            if (keG instanceof C3201Jmc) {
                0fH.A0w("BrowserLiteCallbacker", "Error in logInitialUrlTiming", e);
                try {
                    AnonymousClass001.A0D(((C3201Jmc) keG).A06.getFilesDir(), "browser_ipc_failed").createNewFile();
                    return;
                } catch (IOException unused3) {
                    return;
                }
            }
            if ((keG instanceof JmU) || (keG instanceof JmW)) {
                str = "BrowserLiteCallbacker";
                str2 = "Error in logMAIPlayStoreEvent";
            } else {
                str = "BrowserLiteCallbacker";
                str2 = "BrowserLiteService remote exception happened";
            }
            0fH.A0w(str, str2, e);
        }
    }
}
