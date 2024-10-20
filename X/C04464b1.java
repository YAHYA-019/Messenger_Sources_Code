package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import java.io.Serializable;

/* renamed from: X.4b1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4b1.class */
public final class C04464b1 {
    public static final ImmutableSet A0E = new SingletonImmutableSet(C1xj.A06);
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final C15h A0A;
    public final Context A0B;
    public final 1PB A0C;
    public final Class A0D;

    public C04464b1() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A0B = A00;
        this.A06 = 1Bq.A00(66351);
        this.A01 = 1Bq.A00(67765);
        this.A07 = 1Bq.A00(83604);
        this.A05 = 1Bq.A00(16511);
        this.A03 = 1Bq.A00(131294);
        this.A04 = 1Bq.A00(66897);
        this.A09 = 1Bq.A00(67262);
        this.A0A = new C15h() { // from class: X.4b2
            @Override // X.C15h
            public /* bridge */ /* synthetic */ Object get() {
                return 1Bn.A0A(99943);
            }
        };
        this.A0D = (Class) 1Bn.A0A(66880);
        this.A02 = 1Bu.A00(33230);
        1Br A002 = 1Bq.A00(16626);
        this.A08 = A002;
        this.A0C = ((1P8) A002.A00.get()).A00("notification_instance");
    }

    public static final Intent A00(C04464b1 c04464b1, String str) {
        Intent intent = new Intent(c04464b1.A0B, (Class<?>) c04464b1.A0D);
        intent.setAction(str);
        return intent;
    }

    public static final void A01(Intent intent, C04464b1 c04464b1) {
        if (c04464b1.A07.A00.get() == C0et.A0P) {
            Object obj = c04464b1.A0A.get();
            11T.A0A(obj);
            if (((Boolean) obj).booleanValue() && ((1Rv) c04464b1.A09.A00.get()).A0B() && !((C2j5) c04464b1.A02.A00.get()).A01()) {
                intent.putExtra(C1xj.A0Q, ((1Fv) c04464b1.A06.A00.get()).A04().A02);
                boolean contains = A0E.contains(intent.getAction());
                C04544bB c04544bB = (C04544bB) c04464b1.A03.A00.get();
                c04544bB.A04(4bE.A00);
                C82d c82d = 4bH.A00;
                11T.A0F(c82d, 0);
                C04544bB.A01(c04544bB, c82d.A00, String.valueOf(contains));
                if (!contains || c04464b1.A00) {
                    A02(intent, c04464b1);
                    return;
                }
                ((1FP) 1Br.A0B(c04464b1.A01)).D3D(3Ds.A02, 0S2.A01, new AET(intent, c04464b1), "ChatHeadsInitializer initAfterUiIdle");
                return;
            }
        }
        c04464b1.A0C.BZR("chat_head", "Not sending intent");
    }

    public static final void A02(Intent intent, C04464b1 c04464b1) {
        try {
            ((4bJ) c04464b1.A04.A00.get()).A00(c04464b1.A0B, intent);
        } catch (SecurityException e) {
            1Br.A04(c04464b1.A05).softReport("ChatHeadsIntentDispatcher", e);
        }
    }

    public final void A03() {
        A01(A00(this, C1xj.A09), this);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, X.Abh] */
    public final void A04(ThreadKey threadKey, MessageDeepLinkInfo messageDeepLinkInfo, 5SW r304, String str, boolean z, boolean z2) {
        11T.A0F(threadKey, 0);
        Intent A00 = A00(this, C1xj.A06);
        A00.putExtra(5QN.A01, threadKey);
        A00.putExtra(C1xj.A0T, str);
        if (r304 == null) {
            r304 = 5SW.A1M;
        }
        A00.putExtra("extra_thread_view_source", (Serializable) r304);
        A00.putExtra(AnonymousClass000.A00(3), messageDeepLinkInfo);
        A00.putExtra("extra_msplit_not_consented", z2);
        ?? obj = new Object();
        obj.A0M = z;
        A00.putExtra(AnonymousClass000.A00(61), obj.A00());
        A01(A00, this);
    }

    public final void A05(ThreadKey threadKey, String str) {
        Intent A00 = A00(this, C1xj.A0D);
        A00.putExtra(C1xj.A0W, threadKey.toString());
        A00.putExtra(C1xj.A0T, str);
        A01(A00, this);
    }

    public final void A06(boolean z) {
        Intent A00 = A00(this, C1xj.A0E);
        A00.putExtra(C1xj.A0V, z);
        A01(A00, this);
    }
}
