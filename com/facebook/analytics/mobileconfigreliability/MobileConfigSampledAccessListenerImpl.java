package com.facebook.analytics.mobileconfigreliability;

import X.04J;
import X.1BQ;
import X.1CX;
import X.1Rw;
import X.1UD;
import X.1UG;
import X.1ZG;
import X.C00i;
import com.facebook.analytics.mobileconfigreliability.MobileConfigSampledAccessListenerImpl;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.privacy.acs.falco.FalcoACSProvider;
import com.facebook.smartcapture.logging.CardDataLogger;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: MobileConfigSampledAccessListenerImpl.class */
public final class MobileConfigSampledAccessListenerImpl {
    public boolean A01;
    public volatile boolean A06;
    public final C00i A05 = new 1BQ(16634);
    public final C00i A02 = new 1BQ(131252);
    public final ArrayList A04 = new ArrayList();
    public AtomicReference A00 = new AtomicReference("");
    public final Object A03 = new Object();

    public static void A00(MobileConfigSampledAccessListenerImpl mobileConfigSampledAccessListenerImpl, String str, String str2, String str3, long j, boolean z) {
        int i;
        int[] iArr;
        1UG A00 = 1UD.A00((04J) mobileConfigSampledAccessListenerImpl.A05.get(), 1ZG.A03, "mobile_config_sampled_access");
        if (A00.isSampled()) {
            A00.A6H("internal_sampling_rate", Long.valueOf(CardDataLogger.RECORD_ID));
            A00.A5H("is_default_fallback", Boolean.valueOf(z));
            A00.A7R("param_specifier", Long.toString(j));
            A00.A7R("status", str);
            A00.A7R("start_type", str2);
            A00.A7R("client_value", str3);
            A00.A5H("is_using_translation_table", true);
            int i2 = (int) ((j >>> 54) & 63);
            int i3 = (int) ((j >>> 32) & ((char) (-1)));
            if (i2 < 3) {
                i2 = 1;
            }
            try {
                try {
                    iArr = 1CX.A00[i2];
                } catch (IndexOutOfBoundsException unused) {
                    iArr = new int[0];
                }
                i = iArr[i3];
            } catch (IndexOutOfBoundsException unused2) {
                i = -1;
            }
            A00.A6H(FalcoACSProvider.CONFIG_ID, Long.valueOf(i));
            A00.A6H("param_id", Long.valueOf(1Rw.A00(j)));
            A00.A7R("markers", (String) mobileConfigSampledAccessListenerImpl.A00.get());
            A00.BZL();
        }
    }

    public void A01(final long j, final String str, final String str2, final String str3, final boolean z) {
        if (this.A01) {
            return;
        }
        if (this.A06) {
            A00(this, str, str2, str3, j, z);
            return;
        }
        synchronized (this.A03) {
            this.A04.add(new Runnable() { // from class: X.4Dh
                public static final String __redex_internal_original_name = "MobileConfigSampledAccessListenerImpl$1";

                @Override // java.lang.Runnable
                public void run() {
                    MobileConfigSampledAccessListenerImpl.A00(MobileConfigSampledAccessListenerImpl.this, str, str2, str3, j, z);
                }
            });
        }
    }

    public void A02(Integer num) {
        int i;
        synchronized (this.A03) {
            AtomicReference atomicReference = this.A00;
            Object obj = atomicReference.get();
            switch (num.intValue()) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 7;
                    break;
                case 7:
                    i = 8;
                    break;
                case 8:
                    i = 9;
                    break;
                default:
                    i = 10;
                    break;
            }
            atomicReference.set(StringFormatUtil.formatStrLocaleSafe("%s%d,", obj, Integer.valueOf(i)));
        }
    }
}
