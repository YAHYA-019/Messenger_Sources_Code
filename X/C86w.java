package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* renamed from: X.86w, reason: invalid class name */
/* loaded from: 86w.class */
public final class C86w implements 5HO, 1UN {
    public C86x A00;
    public MailboxCallback A01;
    public Function1 A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1De A06;
    public final C1ko A07;
    public final C1ko A08;
    public final C15h A09;

    public C86w(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A06 = r303;
        final int i = 8;
        C15h c15h = new C15h(i) { // from class: X.3j7
            public final int A00;

            {
                this.A00 = i;
            }

            @Override // X.C15h
            public /* bridge */ /* synthetic */ Object get() {
                switch (this.A00) {
                    case 0:
                        return 1Bn.A0B(16635);
                    case 1:
                    case 2:
                        return 1Bn.A0B(16644);
                    case 3:
                        return 1Fw.A06(1Bn.A0B(16428)).A02;
                    case 4:
                        int i2 = JU4.A1p;
                        return 1Bn.A0B(16881);
                    case 5:
                    case 6:
                    case 7:
                        return 1Bn.A0A(83430);
                    case 8:
                        Context A00 = FbInjector.A00();
                        11T.A0A(A00);
                        return 1Hv.A02(A00, 65728);
                    case 9:
                        return 1Bn.A0B(16390);
                    case 10:
                        return 1Bn.A0B(83432);
                    case 11:
                        boolean z = 1Hj.A00;
                        return 1Bi.A06(ActionId.APP_MAIN);
                    case 12:
                        boolean z2 = 1Hj.A00;
                        return 1Bi.A06(83);
                    case 13:
                        boolean z3 = 1Hj.A00;
                        return 1Bi.A03(16540);
                    case 14:
                        boolean z4 = 1Hj.A00;
                        FbUserSession A0F = 1BL.A0F();
                        try {
                            A0F.BKF();
                        } catch (NullPointerException unused) {
                        }
                        return 1Lo.A04((Context) null, A0F, (1BY) null, 16527);
                    case 15:
                        boolean z5 = 1Hj.A00;
                        return 1Bi.A06(ActionId.APP_DID_ENTER_BACKGROUND);
                    case 16:
                        boolean z6 = 1Hj.A00;
                        Set A06 = 1Bi.A06(ActionId.MQTT_CONNECTING);
                        Set set = (Set) 1Bn.A0E((Context) null, (1BY) null, ActionId.MQTT_CONNECTED);
                        HashSet hashSet = new HashSet(A06);
                        hashSet.addAll(set);
                        return hashSet;
                    default:
                        return null;
                }
            }
        };
        this.A09 = c15h;
        ((1UP) 1BQ.A02(66348).get()).A01(this);
        this.A04 = 7zL.A0S(fbUserSession, r303, 67536);
        this.A05 = 1Bq.A00(67389);
        this.A03 = 1Bq.A00(16449);
        C1k8 c1k8 = new C1k8();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long j = 10;
        c1k8.A05(j, timeUnit);
        C1kn A02 = c1k8.A02();
        this.A07 = A02;
        C1k8 c1k82 = new C1k8();
        c1k82.A05(j, timeUnit);
        C1kn A022 = c1k82.A02();
        this.A08 = A022;
        this.A02 = AVD.A01(this, 36);
        8yI r0 = (8yI) 1Br.A0B(this.A04);
        GPi gPi = new GPi(A02, A022, c15h);
        this.A01 = gPi;
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        1Um.A02(AQV, new A0Q(6, A0P, r0, new C86x(AQV, r0), gPi), A0P, false);
        MailboxFutureImpl A00 = A0P.A00(4YV.A11(this.A03));
        Function1 function1 = this.A02;
        A00.Cu4(function1 != null ? new A1d(function1, 68) : null);
    }

    public void A5z(HaT haT) {
    }

    public void AEM(MediaResource mediaResource) {
    }

    public void AEN(String str) {
    }

    public void AFz() {
        C86x c86x = this.A00;
        if (c86x != null) {
            c86x.D5r();
        }
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A07.BPw();
        this.A08.BPw();
    }

    public void AQd(Message message) {
    }

    public C81P AyH(MontageCard montageCard) {
        return null;
    }

    public double B58(MediaResource mediaResource) {
        Double d;
        Uri uri;
        1Br.A0C(this.A05);
        Long l = null;
        if (mediaResource != null && (uri = mediaResource.A0E) != null) {
            l = Long.valueOf(C03853z9.A00(uri));
        }
        double d2 = 0.0d;
        if (l != null) {
            this.A07.CZv(l, mediaResource);
            GRF grf = (GRF) this.A08.Apt(l);
            if (grf != null && (d = grf.A01) != null) {
                d2 = d.doubleValue();
            }
        }
        return d2;
    }

    public 7Ql BCH(MediaResource mediaResource) {
        Uri uri;
        Long valueOf;
        1Br.A0C(this.A05);
        if (mediaResource != null && (uri = mediaResource.A0E) != null && (valueOf = Long.valueOf(C03853z9.A00(uri))) != null) {
            this.A07.CZv(valueOf, mediaResource);
            GRF grf = (GRF) this.A08.Apt(valueOf);
            if (grf != null) {
                return grf.A00;
            }
        }
        return 7Ql.A0D;
    }

    public C81P BIH(Message message) {
        return new C81P(C81O.NOT_ALL_STARTED, 7Ql.A0D);
    }

    public boolean BXK() {
        return false;
    }

    public void CeU(HaT haT) {
    }

    public MontageCard Ci3(MontageCard montageCard) {
        return null;
    }

    public Message CiB(Message message) {
        return null;
    }

    public void CvL(Capabilities capabilities) {
    }

    public ListenableFuture D2K(MediaResource mediaResource) {
        ListenableFuture listenableFuture = 1hM.A01;
        11T.A0A(listenableFuture);
        return listenableFuture;
    }

    public ListenableFuture D2L(MediaResource mediaResource, boolean z) {
        ListenableFuture listenableFuture = 1hM.A01;
        11T.A0A(listenableFuture);
        return listenableFuture;
    }
}
