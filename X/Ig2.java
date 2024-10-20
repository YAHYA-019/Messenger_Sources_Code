package X;

import com.facebook.messaging.rtc.incall.impl.multiparticipant.MultiParticipantView;
import com.facebook.messaging.rtc.views.rtcomnigridview.RtcOmniGridView;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: Ig2.class */
public final class Ig2 implements JKR {
    public final /* synthetic */ MultiParticipantView A00;
    public final /* synthetic */ RtcOmniGridView A01;

    public Ig2(MultiParticipantView multiParticipantView, RtcOmniGridView rtcOmniGridView) {
        this.A00 = multiParticipantView;
        this.A01 = rtcOmniGridView;
    }

    public static final int A00(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int i = C2628GjQ.A00(it).A03;
        while (true) {
            int i2 = i;
            while (it.hasNext()) {
                i = C2628GjQ.A00(it).A03;
                if (i2 > i) {
                    break;
                }
            }
            return i2;
        }
    }

    public static String A01(GV0 gv0, Number number) {
        return String.valueOf(((C2621GjB) ((List) gv0.A02.A05).get(number.intValue())).A01);
    }

    public static final List A02(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            C2626GjK c2626GjK = ((C2628GjQ) obj).A02;
            if (c2626GjK.A02 >= 0 && c2626GjK.A00 >= 0) {
                A0s.add(obj);
            }
        }
        return A0s;
    }

    public void CAs() {
        MultiParticipantView multiParticipantView = this.A00;
        GrL grL = (GrL) multiParticipantView.A0D.getValue();
        RtcOmniGridView rtcOmniGridView = this.A01;
        double Ai7 = 1Br.A07(((Hbw) multiParticipantView.A0E.getValue()).A00).Ai7(37159812231922042L);
        OmniGridLayoutManager omniGridLayoutManager = rtcOmniGridView.A0H;
        ImmutableList immutableList = omniGridLayoutManager.A09;
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (Ai7 > 0.0d) {
                11T.A0D(number);
                int intValue = number.intValue();
                if (((intValue < 0 || intValue >= omniGridLayoutManager.A07.A09.size()) ? 0.0f : ((C2628GjQ) r0.get(intValue)).A02.A00(omniGridLayoutManager.A1g())) > Ai7) {
                }
            }
            11T.A0D(number);
            A0h.m11011add((Object) A01(rtcOmniGridView, number));
        }
        ImmutableList A01 = 1Fj.A01(A0h);
        IYp iYp = (IYp) 1Br.A0B(grL.A0D);
        if (A01.equals(iYp.A0B)) {
            return;
        }
        iYp.A0B = A01;
        Iterator A012 = IYp.A01(iYp);
        while (A012.hasNext()) {
            Gq8 gq8 = (Gq8) ((Ht3) A012.next());
            if (11 - gq8.A00 == 0) {
                C2475GeW.A00((C2475GeW) gq8.A01);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r0.A1e() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CFy() {
        /*
            Method dump skipped, instructions count: 1548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ig2.CFy():void");
    }

    public void CKs(UserKey userKey) {
        GrL grL = (GrL) this.A00.A0D.getValue();
        ((IYp) 1Br.A0B(grL.A0D)).A06(userKey);
        GrL.A00(grL, GOq.A0p(grL.A0K));
    }
}
