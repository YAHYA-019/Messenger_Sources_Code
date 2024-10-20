package X;

import android.net.Uri;
import com.facebook.messaging.model.messages.Message;

/* renamed from: X.9v8, reason: invalid class name */
/* loaded from: 9v8.class */
public final class C9v8 implements C7y8 {
    public final C9v7 A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.9v7] */
    public C9v8(final AnonymousClass760 anonymousClass760) {
        this.A00 = new 6Je(anonymousClass760) { // from class: X.9v7
            public final AnonymousClass760 A00;

            {
                this.A00 = anonymousClass760;
            }

            public void ANa(AXn aXn, Integer num) {
                this.A00.A01(aXn);
            }

            public void Ckq(5Pz r302, Message message, boolean z) {
            }

            public void CpY(int i) {
                6Nz A00 = this.A00.A00();
                if (A00 != null) {
                    A00.CpY(2132346813);
                }
            }

            public void CpZ(Uri uri) {
                6Nz A00 = this.A00.A00();
                if (A00 != null) {
                    A00.CpZ(uri);
                }
            }

            public void CvW(String str) {
                6Nz A00 = this.A00.A00();
                if (A00 != null) {
                    A00.CvW(str);
                }
            }

            public void CvY(int i) {
                6Nz A00 = this.A00.A00();
                if (A00 != null) {
                    A00.CvY(1);
                }
            }

            public void Cvu(boolean z) {
                6Nz A00 = this.A00.A00();
                if (A00 != null) {
                    A00.Cvu(z);
                }
            }
        };
    }

    @Override // X.C7y8
    public 6Je AlD() {
        return this.A00;
    }
}
