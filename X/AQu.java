package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.lifecycle.Observer;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.Mailbox;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebook.rp.platform.metaai.messenger.MessengerMetaAiRsysDelegate;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.RemoteChannel;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionCount;
import com.facebook.xapp.messaging.reactions.reactors.model.Reactor;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultimap;
import com.google.repack.protobuf.MessageLite;
import com.oculus.atc.EndLinkSetup;
import com.oculus.atc.RequestEncryption;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: AQu.class */
public final class AQu extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQu(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    public static AQu A00(Object obj, Object obj2, Object obj3, int i) {
        return new AQu(i, obj, obj2, obj3);
    }

    public static final void A01(1Br r301, 4NU r302, 8fL r303) {
        if (((8Lp) 7zL.A10(r302)).A01) {
            C6js c6js = (C6js) 1Br.A0B(r301);
            String str = r303.A01;
            11T.A0F(str, 0);
            c6js.A01.add(str);
            if (c6js.A00.contains(str)) {
                c6js.A02(str);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v484, types: [X.6zD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v576, types: [X.70t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v682, types: [X.23P, java.lang.Object] */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass872 anonymousClass872;
        C5fu A01;
        Object obj;
        C00m aQf;
        1Br r310;
        8fL r311;
        7yY r307;
        int i;
        ValueAnimator A012;
        int i2;
        C6js c6js;
        String str;
        A8Z a8z;
        9hT A00;
        KJb kJb;
        Collection A15;
        switch (this.A00) {
            case 0:
                AudioModule AXn = ((IFQ) this.A02).A0F.AXn();
                if (AXn != null) {
                    return HJz.A00(((MessengerMetaAiRsysDelegate) this.A03).A01, AXn, ((C2618Gj7) this.A01).A00);
                }
                throw 1BK.A0h();
            case 1:
            case 2:
            case 3:
            default:
                ((Ab8) ((AXA) this.A03)).BQ6((8LW) this.A01, this.A02);
                A15 = 04S.A00;
                return A15;
            case 4:
                C8fq c8fq = (C8fq) this.A03;
                float f = c8fq.A00;
                C2k5 c2k5 = (C2k5) this.A02;
                aQf = new J9o(((AYb) (c8fq.A01 == 0S2.A00 ? new Object() : new Object())).ASC(3vP.A00(c2k5), (9Ph) this.A01, 0KF.A01(f * 7zO.A0I(3vP.A00(c2k5)).density)), 21);
                return 7zL.A0T(aQf);
            case 5:
                IE6 ie6 = (IE6) this.A03;
                1Up r0 = ie6.A04;
                Kzi kzi = (Kzi) this.A01;
                int i3 = kzi.A01;
                r0.A04(new HoC(0Pz.A0W("Receiving message on service: ", 9Eq.A00(9Ep.A00(i3)))));
                ByteBuffer byteBuffer = kzi.A00;
                if (byteBuffer == null) {
                    throw new IOException("buffer is disposed");
                }
                KLx kLx = new KLx(byteBuffer);
                if (i3 == 1) {
                    kJb = (RequestEncryption) KJb.A02(RequestEncryption.DEFAULT_INSTANCE, kLx);
                } else {
                    if (i3 != 4096) {
                        throw new IOException("Unsupported message type");
                    }
                    kJb = (EndLinkSetup) KJb.A02(EndLinkSetup.DEFAULT_INSTANCE, kLx);
                }
                11T.A0A(kJb);
                Object obj2 = (MessageLite) kJb;
                if (obj2 instanceof RequestEncryption) {
                    CipherBuilder A002 = IE6.A00(ie6);
                    int A03 = 07C.A03(C07y.A00, new 07E(0, (-1) >>> 1));
                    boolean A1Q = AnonymousClass001.A1Q(((RequestEncryption) obj2).supportedParameters_ & 1, 1);
                    83T A013 = 83T.A01(A002, obj2, 37);
                    CipherBuilder cipherBuilder = new CipherBuilder();
                    A013.invoke(cipherBuilder);
                    ie6.A05.A07(new ARQ(cipherBuilder, new LZ7(cipherBuilder.buildEncryptionFraming(A03, A1Q)), ie6, (RemoteChannel) this.A02, A03, A1Q));
                } else {
                    if (!(obj2 instanceof EndLinkSetup)) {
                        throw new IOException("Unsupported message");
                    }
                    0fH.A0l("LinkSetup", AnonymousClass001.A0Z(obj2, "Received EndLinkSetup: ", AnonymousClass001.A0k()));
                    ie6.A09.interruptWithError(Kc1.A00);
                    IE6.A04(ie6, new JBV(obj2, 48));
                }
                A15 = 04S.A00;
                return A15;
            case 6:
                UUID uuid = (UUID) this.A02;
                HCo hCo = (HCo) this.A01;
                11T.A0H(uuid, hCo);
                KGU newBuilder = EndLinkSetup.newBuilder();
                newBuilder.A06();
                ((EndLinkSetup) ((KGw) newBuilder).A00).state_ = hCo.getNumber();
                KEB A014 = Lj5.A01(KwG.A01(uuid), 0, 16);
                newBuilder.A06();
                ((EndLinkSetup) ((KGw) newBuilder).A00).uuid_ = A014;
                Kzi A003 = KXf.A00(newBuilder.A05(), RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
                0fH.A0l("LinkSetup", AnonymousClass001.A0Z(A003, "Sending EndLinkSetupMessage: ", AnonymousClass001.A0k()));
                IE6 ie62 = (IE6) this.A03;
                ie62.A02.send(A003);
                IE6.A04(ie62, 83T.A01(uuid, hCo, 38));
                ie62.A0E.invoke();
                A15 = 04S.A00;
                return A15;
            case 7:
                C7Us c7Us = (C7Us) this.A02;
                for (C87v c87v : c7Us.A01) {
                    if (!((ThreadKey) this.A03).A0y() || c87v.A00 != C6qi.A02) {
                        7FI.A02((6RU) this.A01, new 7CL(new 7fJ((C6qi) c87v.A00, 0), true));
                    }
                }
                String str2 = c7Us.A00;
                if (str2 != null) {
                    7FI.A02((6RU) this.A01, new 7Ar(str2));
                }
                6RU r02 = (6RU) this.A01;
                7FI.A02(r02, 7Al.A03);
                7FI.A02(r02, 7As.A02);
                A15 = 04S.A00;
                return A15;
            case 8:
                C9n2 c9n2 = (C9n2) this.A03;
                c9n2.A07.removeObserver((Observer) this.A02);
                c9n2.A06.removeObserver((Observer) this.A01);
                C9iE c9iE = (C9iE) 1Br.A0B(c9n2.A09);
                9sE r03 = c9n2.A0I;
                11T.A0F(r03, 0);
                c9iE.A08.remove(r03);
                A15 = 04S.A00;
                return A15;
            case 9:
                C9qq c9qq = new C9qq(this.A02, ActionId.RTMP_CONNECTION_REQUESTED);
                C9qq c9qq2 = new C9qq(this.A01, 108);
                C9n2 c9n22 = (C9n2) this.A03;
                c9n22.A07.observeForever(c9qq);
                c9n22.A06.observeForever(c9qq2);
                c9n22.A06();
                aQf = A00(c9qq, c9n22, c9qq2, 8);
                return 7zL.A0T(aQf);
            case 10:
                7FK r04 = (7FK) this.A02;
                r04.A01 = null;
                r04.A02.set(false);
                7FN r05 = (7FN) this.A03;
                WeakReference A14 = 7zL.A14(this.A01);
                Integer num = 0S2.A0Y;
                Bundle bundle = Bundle.EMPTY;
                11T.A0B(bundle);
                r05.ASJ(r04.AUS(bundle), num, 4YT.A00(1101), A14);
                A15 = 04S.A00;
                return A15;
            case 11:
                8iJ.A0O((96L) this.A02, (8iJ) this.A03, (AXE) this.A01);
                A15 = 04S.A00;
                return A15;
            case 12:
                String A004 = 9E2.A00((String) ((C2lh) this.A01).A02);
                9Xh r06 = (9Xh) 1Hv.A02(7zU.A0A(this.A02), 68097);
                if (((8iJ) this.A03).A0M && A004 != null && (A00 = r06.A00("generated_suggested_sticker_search_loader_key")) != null) {
                    A00.A01(new C2636Gjo(A004, AnonymousClass001.A0K()));
                }
                A15 = 04S.A00;
                return A15;
            case 13:
                1LI r07 = (1LI) this.A01;
                1Iw r08 = ((C2k5) this.A02).A05;
                ?? obj3 = new Object();
                r07.A0c(r08, (C23P) obj3, 0, 0);
                return Integer.valueOf(obj3.A00 / 2);
            case 14:
                return new 94H(((C6qu) this.A03).AWp(), (84T) this.A02, (6tM) this.A01);
            case 15:
                C6qu c6qu = (C6qu) this.A03;
                return new AB7(c6qu.BF7(), (AnonymousClass754) 7zO.A0p(this.A01), c6qu.Ao5(), c6qu.Ad4(), (C74b) this.A02);
            case 16:
                return new AAV(((C6qu) this.A03).Akk(), (C2on) this.A02, (7Kx) 7zM.A1A(this.A01));
            case 17:
                C6qu c6qu2 = (C6qu) this.A03;
                6yM Ad4 = c6qu2.Ad4();
                6rM r09 = (6rM) c6qu2.A06;
                MigColorScheme migColorScheme = r09.BFP().A0F;
                74E r010 = (74E) r09.A0D.getValue();
                C03853z9 c03853z9 = (C03853z9) 7zO.A0p(this.A02);
                C66e AwD = c6qu2.AwD();
                boolean BAl = c6qu2.BAl();
                A86 a86 = ((C20i) 1Br.A0B(r09.A03)).A00() ? (A86) 1Br.A0B(r09.A04) : null;
                2Og Aoc = r09.Aoc();
                7Jw r305 = r09.Axw().AZk(36310675734397851L) ? new 7Jw(7zR.A0v(new C01i[]{r09.Axw().AZk(36310675731186551L) ? new 6wQ(new AKN(c6qu2, 40)) : null, 2yD.A03(r09.Axw(), 36326051705607339L) ? new 6wQ(new AKN(c6qu2, 41)) : null})) : null;
                ?? obj4 = new Object();
                boolean AZk = r09.Axw().AZk(36323040934512823L);
                9MA r011 = new 9MA(r09);
                11T.A0D(migColorScheme);
                return new AAf(migColorScheme, c03853z9, r011, (C70t) obj4, a86, r010, Ad4, Aoc, r305, AwD, (0Be) this.A01, BAl, AZk);
            case 18:
                return new AAX(((C6qu) this.A03).Akk(), (7Kx) 7zM.A1A(this.A02), (C72n) this.A01);
            case 19:
                7Tn r012 = 7Tn.A06;
                return new 7Tn((C70p) this.A01, (Function1) this.A02, ((C6qu) this.A03).BF7().A0z());
            case 20:
                C6ze c6ze = C6ze.A07;
                ?? obj5 = new Object();
                Object obj6 = this.A01;
                Object obj7 = this.A03;
                AnonymousClass701 A005 = 71C.A00(c6ze, (6zD) obj5, A00(this.A02, obj7, obj6, 19));
                C6ze c6ze2 = C6ze.A0W;
                AKL akl = new AKL(obj7, 33);
                6zM r013 = 6zM.A00;
                11T.A0F(r013, 1);
                return C0s8.A14(A005, 71C.A00(c6ze2, r013, akl));
            case 21:
                return Integer.valueOf(0KF.A01(((C4s1) 7zO.A0p(this.A01)).A06() / 7zO.A0I(7zU.A0A(this.A02)).density));
            case 22:
                return Integer.valueOf(0KF.A01(((C4s1) 7zO.A0p(this.A01)).A08() / 7zO.A0I(7zU.A0A(this.A02)).density));
            case 23:
                Runnable A0r = 7zR.A0r(this.A02);
                if (A0r != null) {
                    ((8hB) this.A03).A01.removeCallbacks(A0r);
                }
                Runnable A0r2 = 7zR.A0r(this.A01);
                if (A0r2 != null) {
                    ((8hB) this.A03).A01.removeCallbacks(A0r2);
                }
                A15 = 04S.A00;
                return A15;
            case 24:
                A012 = (ValueAnimator) 7zL.A10((4NU) this.A01);
                A012.setFloatValues(7zM.A00(((C1rn) this.A02).A00), ((8Uz) this.A03).A00);
                0K6.A00(A012);
                i2 = 2;
                aQf = new AQY(A012, i2);
                return 7zL.A0T(aQf);
            case 25:
                A012 = 2aG.A01();
                8WT r014 = (8WT) this.A03;
                0N2.A03(A012, new C0oe((Function2) new AJf(this.A02, this.A01, null, 25), (0zV) A86.A00((A86) r014.A01, r014.A00), 3));
                i2 = 5;
                aQf = new AQY(A012, i2);
                return 7zL.A0T(aQf);
            case 26:
                ((Mailbox) this.A01).removeStoredProcedureChangedListener((C21h) this.A02);
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Unregistered for sproc(s): ");
                0fH.A0j("MailboxSuspenses", AnonymousClass001.A0a(this.A03, A0k));
                A15 = 04S.A00;
                return A15;
            case 27:
                c6js = (C6js) 7zO.A0p(this.A01);
                str = ((8fL) this.A03).A01;
                a8z = (A8Z) this.A02;
                c6js.A01(a8z, str);
                A15 = 04S.A00;
                return A15;
            case 28:
                r310 = (1Br) this.A01;
                C6js c6js2 = (C6js) 1Br.A0B(r310);
                r311 = (8fL) this.A03;
                String str3 = r311.A01;
                r307 = (A8Z) this.A02;
                c6js2.A00(r307, str3);
                i = 27;
                aQf = A00(r307, r311, r310, i);
                return 7zL.A0T(aQf);
            case 29:
                4NU r015 = (4NU) this.A01;
                8fL r016 = (8fL) this.A03;
                1Br r017 = (1Br) this.A02;
                return new 8I1(r017, r015, new 8Hu(r017, r015, r016), r016);
            case 30:
                c6js = (C6js) this.A01;
                str = ((8YT) this.A03).A01;
                a8z = (A8Y) this.A02;
                c6js.A01(a8z, str);
                A15 = 04S.A00;
                return A15;
            case 31:
                c6js = (C6js) 7zO.A0p(this.A01);
                str = ((8bO) this.A03).A00;
                a8z = (A8Y) this.A02;
                c6js.A01(a8z, str);
                A15 = 04S.A00;
                return A15;
            case 32:
                r310 = (1Br) this.A01;
                C6js c6js3 = (C6js) 1Br.A0B(r310);
                r311 = (8bO) this.A03;
                String str4 = ((8bO) r311).A00;
                r307 = (A8Y) this.A02;
                c6js3.A00(r307, str4);
                i = 31;
                aQf = A00(r307, r311, r310, i);
                return 7zL.A0T(aQf);
            case 33:
                c6js = (C6js) 7zO.A0p(this.A01);
                str = ((8bP) this.A03).A00;
                a8z = (A8Y) this.A02;
                c6js.A01(a8z, str);
                A15 = 04S.A00;
                return A15;
            case 34:
                r310 = (1Br) this.A01;
                C6js c6js4 = (C6js) 1Br.A0B(r310);
                r311 = (8bP) this.A03;
                String str5 = ((8bP) r311).A00;
                r307 = (A8Y) this.A02;
                c6js4.A00(r307, str5);
                i = 33;
                aQf = A00(r307, r311, r310, i);
                return 7zL.A0T(aQf);
            case 35:
                c6js = (C6js) 7zO.A0p(this.A01);
                str = ((8bQ) this.A03).A00;
                a8z = (A8Z) this.A02;
                c6js.A01(a8z, str);
                A15 = 04S.A00;
                return A15;
            case 36:
                r310 = (1Br) this.A01;
                C6js c6js5 = (C6js) 1Br.A0B(r310);
                r311 = (8bQ) this.A03;
                String str6 = ((8bQ) r311).A00;
                r307 = (A8Z) this.A02;
                c6js5.A00(r307, str6);
                i = 35;
                aQf = A00(r307, r311, r310, i);
                return 7zL.A0T(aQf);
            case 37:
                c6js = (C6js) 7zO.A0p(this.A01);
                str = ((8bR) this.A03).A00;
                a8z = (A8Y) this.A02;
                c6js.A01(a8z, str);
                A15 = 04S.A00;
                return A15;
            case 38:
                r310 = (1Br) this.A01;
                C6js c6js6 = (C6js) 1Br.A0B(r310);
                r311 = (8bR) this.A03;
                String str7 = ((8bR) r311).A00;
                r307 = (A8Y) this.A02;
                c6js6.A00(r307, str7);
                i = 37;
                aQf = A00(r307, r311, r310, i);
                return 7zL.A0T(aQf);
            case 39:
                8bS r018 = (8bS) this.A03;
                9Zu r019 = (9Zu) 7zO.A0n(r018.A00, (C2k5) this.A02, 67795);
                9bU r020 = (9bU) 1Bi.A03(67960);
                r020.A01(true, ((AnonymousClass610) 1Br.A0B(r019.A01)).A01());
                aQf = new AQf(2aK.A04(new AJg(this.A01, r018, r020, r019, (0DR) null, 15, 42), 2Zy.A01(7zN.A0x())), r020, 40);
                return 7zL.A0T(aQf);
            case 40:
                4NU r021 = (4NU) this.A01;
                ImmutableMultimap immutableMultimap = (ImmutableMultimap) 7zL.A10(r021);
                ImmutableMultimap immutableMultimap2 = ((AnonymousClass865) this.A03).A00;
                if (immutableMultimap != null && immutableMultimap2 != null && !immutableMultimap.equals(immutableMultimap2)) {
                    ImmutableCollection A0G = immutableMultimap.A0G();
                    11T.A0A(A0G);
                    HashSet A0v = AnonymousClass001.A0v();
                    Iterator<E> it = A0G.iterator();
                    while (it.hasNext()) {
                        A0v.add(((Reactor) it.next()).A00);
                    }
                    ImmutableCollection AQp = immutableMultimap2.AQp();
                    11T.A0A(AQp);
                    Iterator<E> it2 = AQp.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            11T.A0D((Map.Entry) obj);
                            if (!A0v.contains(((Reactor) r0.getValue()).A00)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry != null) {
                        Object key = entry.getKey();
                        11T.A0A(key);
                        String str8 = (String) key;
                        Object value = entry.getValue();
                        11T.A0A(value);
                        ((C2lh) this.A02).A02(new 8Ls((Reactor) value, str8, 12));
                        return null;
                    }
                }
                1sP.A00();
                r021.A00 = immutableMultimap2;
                return null;
            case 41:
                return new 8BP(1, this.A01, this.A02, this.A03);
            case 42:
                A15 = 7zL.A15();
                Set set = (Set) this.A02;
                if (!11T.A0O(set, this.A01)) {
                    Iterator it3 = ((8AA) this.A03).A07.iterator();
                    while (it3.hasNext()) {
                        MessageReactionCount messageReactionCount = (MessageReactionCount) it3.next();
                        if (!messageReactionCount.A05) {
                            String str9 = messageReactionCount.A02;
                            if (!set.contains(str9) && str9 != null) {
                                A15.add(str9);
                            }
                        }
                    }
                }
                return A15;
            case 43:
                A15 = 7zL.A15();
                Set set2 = (Set) this.A02;
                if (!11T.A0O(set2, this.A01)) {
                    Iterator it4 = ((8AA) this.A03).A07.iterator();
                    while (it4.hasNext()) {
                        MessageReactionCount messageReactionCount2 = (MessageReactionCount) it4.next();
                        if (messageReactionCount2.A05) {
                            String str10 = messageReactionCount2.A02;
                            if (!set2.contains(str10) && str10 != null) {
                                A15.add(str10);
                            }
                        }
                    }
                }
                return A15;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                C85u c85u = new C85u(((C2k5) this.A02).A05, new 7Jn());
                c85u.A1b(2132279309);
                7Jn r022 = c85u.A01;
                r022.A00 = 0;
                BitSet bitSet = c85u.A02;
                bitSet.set(1);
                List list = (List) this.A01;
                if (list != null) {
                    if (r022.A03.isEmpty()) {
                        r022.A03 = list;
                    } else {
                        r022.A03.addAll(list);
                    }
                }
                r022.A01 = ((C8dc) this.A03).A04;
                bitSet.set(0);
                C1rs.A00(bitSet, c85u.A03);
                c85u.A0J();
                return r022;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                C00m c00m = (C00m) this.A03;
                c00m.invoke();
                9YQ r023 = (9YQ) 7zM.A1A(this.A01);
                Function1 function1 = (Function1) this.A02;
                boolean A1W = 1BL.A1W(function1, c00m);
                TimeInterpolator timeInterpolator = C9lk.A04;
                ValueAnimator A015 = C9lk.A01(new AccelerateDecelerateInterpolator(), function1, 0.0f, 1.0f, 300L);
                r023.A00();
                r023.A01 = A1W;
                r023.A00 = A015;
                A015.addListener(new 9nX(r023, c00m, 8));
                0K6.A00(A015);
                A15 = 04S.A00;
                return A15;
            case 46:
                5VY r024 = ((C87J) this.A03).A00;
                if (r024 == null) {
                    return C85q.A00();
                }
                2aH A016 = 2aG.A01();
                java.util.Map map = (java.util.Map) this.A01;
                Set keySet = map.keySet();
                ArrayList A0z = 1BL.A0z(keySet);
                Iterator it5 = keySet.iterator();
                while (it5.hasNext()) {
                    A0z.add(A86.A00((A86) r024, AnonymousClass001.A05(it5.next())));
                }
                0N2.A03(A016, new AHw(5, this.A02, map, 0QD.A0V(A0z).toArray(new 0zV[0])));
                return 7zL.A0T(new AQY(A016, 49));
            case ActionId.ON_START_END /* 47 */:
                8bX r025 = (8bX) this.A03;
                Object obj8 = this.A01;
                ContentResolver contentResolver = ((C2k5) this.A02).A05.A0D.getContentResolver();
                11T.A0A(contentResolver);
                2aK.A03((Integer) null, 2Zo.A00(), new AJf(r025, obj8, contentResolver, null, 27), 7zO.A16(r025.A00), 2);
                return null;
            case ActionId.QUEUED /* 48 */:
                C5fu c5fu = (C5fu) this.A01;
                C70p c70p = (C70p) this.A02;
                if (c70p != null && (A01 = c70p.A01(c5fu)) != null) {
                    c5fu = A01;
                }
                return c5fu.AxW(C5uf.A00);
            case ActionId.IN_PROGRESS /* 49 */:
                C2k5 c2k52 = (C2k5) this.A02;
                1Iw r026 = c2k52.A05;
                88H r027 = (88H) this.A03;
                final AYy aYy = r027.A0A;
                Object obj9 = this.A01;
                C83d A006 = C83d.A00(obj9, r027, c2k52, 43);
                C86s c86s = r027.A02;
                if (c86s != null) {
                    final C83d A007 = C83d.A00(obj9, r027, c2k52, 44);
                    11T.A0F(aYy, 0);
                    final Context context = c86s.A00;
                    final 6oL r028 = c86s.A01;
                    anonymousClass872 = new AnonymousClass872(context, r028, aYy, A007) { // from class: X.873
                        public final 1Br A00;
                        public final Context A01;
                        public final 6oL A02;
                        public final AYy A03;
                        public final Function1 A04;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(aYy, A007);
                            11T.A0F(r028, 4);
                            this.A01 = context;
                            this.A03 = aYy;
                            this.A04 = A007;
                            this.A02 = r028;
                            this.A00 = 1Bu.A00(66170);
                        }

                        @Override // X.AnonymousClass872, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                            11T.A0F(motionEvent, 0);
                            if (!((C67J) 1Br.A0B(this.A00)).A06("messenger_video_placeholder")) {
                                return super.onSingleTapConfirmed(motionEvent);
                            }
                            this.A02.A00(new ABV(motionEvent, this), "messenger_video_placeholder", 2131953068);
                            return true;
                        }
                    };
                } else {
                    anonymousClass872 = null;
                }
                11T.A0F(aYy, 1);
                if (anonymousClass872 == null) {
                    anonymousClass872 = new AnonymousClass872(aYy, A006);
                }
                return new AnonymousClass874(r026, anonymousClass872);
        }
    }
}
