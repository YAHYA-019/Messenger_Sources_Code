package X;

import com.facebook.rsys.audio.gen.AudioModel;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.callintent.gen.CallIntent;
import com.facebook.rsys.ended.gen.EndedModel;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.log.gen.LogModel;
import com.facebook.rsys.state.gen.State;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Gjn, reason: case insensitive filesystem */
/* loaded from: Gjn.class */
public final class C2635Gjn extends C04v {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2635Gjn(int i) {
        this(null, null);
        this.A00 = i;
        this.A00 = 1;
    }

    public C2635Gjn(AnonymousClass970 anonymousClass970, C5xv c5xv) {
        this.A00 = 1;
        this.A02 = anonymousClass970;
        this.A03 = c5xv;
        this.A05 = null;
        this.A04 = null;
        this.A06 = false;
        this.A01 = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2635Gjn(AnonymousClass970 anonymousClass970, C5xv c5xv, CharSequence charSequence, CharSequence charSequence2, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(anonymousClass970, c5xv);
        this.A00 = 1;
    }

    public C2635Gjn(C2636Gjo c2636Gjo, Integer num, Integer num2, List list, List list2, boolean z) {
        this.A00 = 0;
        11T.A0F(c2636Gjo, 1);
        this.A03 = c2636Gjo;
        this.A02 = list;
        this.A04 = list2;
        this.A01 = num;
        this.A05 = num2;
        this.A06 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2635Gjn(C2636Gjo c2636Gjo, Integer num, List list, List list2, boolean z) {
        this(c2636Gjo, num, 0S2.A00, list, list2, z);
        this.A00 = 0;
    }

    public C2635Gjn(Gw1 gw1, CallIntent callIntent, GwV gwV, GroupExpansionProxy groupExpansionProxy, List list, boolean z) {
        this.A00 = 2;
        this.A02 = callIntent;
        this.A06 = z;
        this.A01 = gw1;
        this.A03 = gwV;
        this.A05 = groupExpansionProxy;
        this.A04 = list;
    }

    public C2635Gjn(AudioModel audioModel, CallModel callModel, EndedModel endedModel, LogModel logModel, State state, boolean z) {
        this.A00 = 3;
        this.A05 = state;
        this.A02 = callModel;
        this.A03 = endedModel;
        this.A01 = audioModel;
        this.A04 = logModel;
        this.A06 = z;
    }

    public static /* synthetic */ C2635Gjn A00(C2635Gjn c2635Gjn, C2636Gjo c2636Gjo, Integer num, Integer num2, int i) {
        Integer num3 = num2;
        Integer num4 = num;
        C2636Gjo c2636Gjo2 = c2636Gjo;
        List list = null;
        List list2 = null;
        boolean z = false;
        if ((i & 1) != 0) {
            c2636Gjo2 = (C2636Gjo) c2635Gjn.A03;
        }
        if ((i & 2) != 0) {
            list = (List) c2635Gjn.A02;
        }
        if ((i & 4) != 0) {
            list2 = (List) c2635Gjn.A04;
        }
        if ((i & 8) != 0) {
            num4 = (Integer) c2635Gjn.A01;
        }
        if ((i & 16) != 0) {
            num3 = (Integer) c2635Gjn.A05;
        }
        if ((i & 32) != 0) {
            z = c2635Gjn.A06;
        }
        11T.A0F(c2636Gjo2, 0);
        7zT.A1W(list, list2, num4, num3);
        return new C2635Gjn(c2636Gjo2, num4, num3, list, list2, z);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2635Gjn.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public int hashCode() {
        int A05;
        int hashCode;
        int A02;
        int A03;
        switch (this.A00) {
            case 0:
                A05 = (AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A02, 1BL.A03(this.A03))) + 9Cd.A00((Integer) this.A01)) * 31;
                int A032 = AnonymousClass001.A03(this.A05);
                hashCode = (1 != A032 ? "DONE" : "REVERT").hashCode() + A032;
                A03 = (A05 + hashCode) * 31;
                A02 = AnonymousClass002.A00(this.A06 ? 1 : 0);
                return A02 + A03;
            case 1:
                A02 = ((((((((AnonymousClass001.A02(this.A02) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31;
                A03 = 4YU.A03(this.A01);
                return A02 + A03;
            case 2:
                A03 = (AnonymousClass002.A05(this.A03, AnonymousClass002.A05(this.A01, (1BL.A03(this.A02) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31)) + AnonymousClass001.A02(this.A05)) * 31;
                A02 = this.A04.hashCode();
                return A02 + A03;
            case 3:
                A05 = (((((1BL.A03(this.A05) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A01)) * 31;
                hashCode = 4YU.A03(this.A04);
                A03 = (A05 + hashCode) * 31;
                A02 = AnonymousClass002.A00(this.A06 ? 1 : 0);
                return A02 + A03;
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        if (2 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallConfig(callIntent=");
        A0k.append(this.A02);
        A0k.append(", setupMode=");
        A0k.append(this.A06);
        A0k.append(", audioProxy=");
        A0k.append(this.A01);
        A0k.append(", cameraProxy=");
        A0k.append(this.A03);
        A0k.append(", groupExpansionProxy=");
        A0k.append(this.A05);
        A0k.append(", extraFeatures=");
        return AnonymousClass002.A0K(this.A04, A0k);
    }
}
