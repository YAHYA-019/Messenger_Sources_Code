package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.45a, reason: invalid class name */
/* loaded from: 45a.class */
public final class C45a {
    public String A00;
    public final C00i A02 = new 1BV(17004);
    public final C00i A07 = new 1BV(17010);
    public final C00i A01 = FbInjector.A00;
    public final C00i A05 = new 1BQ(32908);
    public final C00i A0B = new 1BV(67043);
    public final C00i A0A = new 1BQ(82523);
    public final C00i A09 = new 1BV(16862);
    public final C00i A04 = new 1BQ(66536);
    public final C00i A06 = new 1BV(16671);
    public final C00i A03 = new 1BQ(16385);
    public final C15h A0C = new C4Xh(this, 5);
    public final C1AJ A08 = new Object();

    public int A00() {
        return ((C10934v0) ((2Pb) this.A02.get()).A02.get()).A00;
    }

    public int A01() {
        ((C10934v0) ((2Pb) this.A02.get()).A02.get()).A01.get();
        return 2132347032;
    }

    public Uri A02() {
        String obj;
        if (this.A00 == null) {
            this.A0B.get();
            Uri A01 = ((AnonymousClass468) this.A05.get()).A01("out_of_app_message").A01((Context) this.A01.get());
            if (A01 == null || (obj = A01.toString()) == null) {
                throw AnonymousClass001.A0T(0Pz.A0W("Unable to load sound! ", "out_of_app_message"));
            }
            this.A00 = obj;
        }
        2Pb r0 = (2Pb) this.A02.get();
        String str = this.A00;
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) r0.A01.get();
        1G2 r02 = 1NK.A2s;
        String BD0 = str == null ? fbSharedPreferences.BD0(r02) : fbSharedPreferences.A3a(r02, str);
        C1AJ c1aj = this.A08;
        Uri A00 = C0A2.A00(c1aj, BD0);
        if (C46E.A00((Context) this.A01.get(), A00) == null) {
            A00 = C0A2.A00(c1aj, this.A00);
        }
        return A00;
    }

    public boolean A03() {
        return ((FbSharedPreferences) ((2Pb) this.A02.get()).A01.get()).AZn(1NK.A0A, true);
    }

    public boolean A04() {
        return ((FbSharedPreferences) ((2Pb) this.A02.get()).A01.get()).AZn(1NK.A0B, true);
    }

    public boolean A05(Message message, ThreadSummary threadSummary) {
        if (message.A1x) {
            return false;
        }
        if (threadSummary == null || !((C5py) this.A0A.get()).A00(threadSummary)) {
            return A06(message.A0V);
        }
        return false;
    }

    public boolean A06(ThreadKey threadKey) {
        if (ThreadKey.A0S(threadKey) && !((1SI) this.A06.get()).A04()) {
            return false;
        }
        boolean A0p = ThreadKey.A0p(threadKey);
        2Pb r0 = (2Pb) this.A02.get();
        return A0p ? ((C7G) r0.A04.get()).A01() : ((FbSharedPreferences) r0.A01.get()).AZn(1NK.A2n, true);
    }

    public boolean A07(ThreadKey threadKey) {
        if ((ThreadKey.A0S(threadKey) && !((2yD) ((1SI) this.A06.get()).A00.get()).AZk(36314176123903560L)) || ThreadKey.A0V(threadKey) || ThreadKey.A0d(threadKey)) {
            return false;
        }
        return !((Boolean) this.A09.get()).booleanValue() || ((Boolean) this.A0C.get()).booleanValue();
    }
}
