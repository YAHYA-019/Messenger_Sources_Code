package com.facebook.messaging.rtc.incall.impl.multiparticipant;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.2Wo;
import X.4YU;
import X.7zN;
import X.AbI;
import X.AbK;
import X.AnonymousClass001;
import X.C00j;
import X.C01i;
import X.C09s;
import X.GOo;
import X.GOq;
import X.GV0;
import X.GrL;
import X.HIn;
import X.HVS;
import X.HVT;
import X.IKe;
import X.IQ7;
import X.Ig2;
import X.J9t;
import X.JKw;
import X.JPR;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.messaging.rtc.incall.impl.widgets.CallBackgroundView;
import com.facebook.messaging.rtc.incall.impl.widgets.gradientbackground.GradientCallBackgroundView;
import com.facebook.messaging.rtc.views.rtcomnigridview.RtcOmniGridView;
import com.facebook.widget.CustomFrameLayout;
import java.util.HashMap;

/* loaded from: MultiParticipantView.class */
public final class MultiParticipantView extends CustomFrameLayout implements JPR {
    public View A00;
    public HVT A01;
    public CallBackgroundView A02;
    public GradientCallBackgroundView A03;
    public 2Wo A04;
    public 2Wo A05;
    public 2Wo A06;
    public 2Wo A07;
    public 2Wo A08;
    public RtcOmniGridView A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final C01i A0D;
    public final C01i A0E;
    public final JKw A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParticipantView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0E = J9t.A01(this, 11);
        this.A0D = J9t.A01(this, 10);
        Context context2 = getContext();
        this.A0B = 1HG.A00(context2, 115775);
        this.A0C = GOo.A0L();
        this.A0A = 1Bu.A01(context2, 67677);
        this.A0F = new IQ7(this);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParticipantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A0E = J9t.A01(this, 11);
        this.A0D = J9t.A01(this, 10);
        Context context2 = getContext();
        this.A0B = 1HG.A00(context2, 115775);
        this.A0C = GOo.A0L();
        this.A0A = 1Bu.A01(context2, 67677);
        this.A0F = new IQ7(this);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParticipantView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0E = J9t.A01(this, 11);
        this.A0D = J9t.A01(this, 10);
        Context context2 = getContext();
        this.A0B = 1HG.A00(context2, 115775);
        this.A0C = GOo.A0L();
        this.A0A = 1Bu.A01(context2, 67677);
        this.A0F = new IQ7(this);
        A00();
    }

    private final void A00() {
        C00j.A05("MultiParticipantView.init", -962785886);
        try {
            Context context = getContext();
            View.inflate(context, 2132542797, this);
            AbK.A0v(this, 2131367050).A03();
            AbK.A0v(this, 2131367047).A03();
            RtcOmniGridView rtcOmniGridView = (RtcOmniGridView) C09s.A01(this, 2131367049);
            this.A01 = new HVT(rtcOmniGridView);
            this.A09 = rtcOmniGridView;
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put(4YU.A0k(), new Object());
            A0u.put(7zN.A0i(), new Object());
            rtcOmniGridView.A07(A0u);
            rtcOmniGridView.A03 = new HVS(this);
            ((GV0) rtcOmniGridView).A00 = new IKe(this, rtcOmniGridView, 2);
            rtcOmniGridView.A00 = new Ig2(this, rtcOmniGridView);
            View view = new View(context);
            this.A00 = view;
            addView(view);
            this.A04 = GOq.A0v(this, 2131362693);
            this.A06 = GOq.A0v(this, 2131363690);
            this.A05 = GOq.A0v(this, 2131363002);
            this.A08 = GOq.A0v(this, 2131365494);
            this.A07 = GOq.A0v(this, 2131363821);
            C00j.A01(-579958772);
        } catch (Throwable th) {
            C00j.A01(482062482);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x025f, code lost:
    
        r310.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0245, code lost:
    
        if (r310.A00 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0254, code lost:
    
        if (r310.A00 != null) goto L128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d7 A[Catch: all -> 0x03e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03e1, blocks: (B:3:0x0019, B:5:0x0027, B:8:0x0031, B:14:0x004b, B:15:0x0051, B:16:0x0058, B:18:0x0068, B:19:0x006e, B:21:0x0076, B:23:0x03d9, B:25:0x03e0, B:28:0x00e4, B:30:0x00f8, B:34:0x0106, B:37:0x011b, B:45:0x017b, B:47:0x0180, B:50:0x0193, B:53:0x019e, B:56:0x01a8, B:59:0x01b3, B:61:0x01b9, B:64:0x01c3, B:67:0x01cd, B:70:0x01d8, B:71:0x01de, B:72:0x01e4, B:73:0x01ea, B:75:0x01f0, B:77:0x01fb, B:81:0x020e, B:84:0x024b, B:87:0x0257, B:90:0x0270, B:93:0x027b, B:95:0x0281, B:98:0x028b, B:99:0x0292, B:102:0x029c, B:103:0x02a1, B:104:0x02a7, B:106:0x02ae, B:108:0x02b4, B:110:0x02cb, B:113:0x02d7, B:116:0x02e2, B:118:0x02fb, B:121:0x030b, B:124:0x0314, B:125:0x031a, B:126:0x0321, B:127:0x0328, B:130:0x0332, B:133:0x033b, B:135:0x034b, B:137:0x0354, B:139:0x035c, B:142:0x036a, B:144:0x0371, B:148:0x037d, B:149:0x0383, B:150:0x0389, B:151:0x0390, B:153:0x0395, B:156:0x039d, B:158:0x03a5, B:160:0x02ea, B:163:0x02f5, B:164:0x03b8, B:165:0x02ba, B:168:0x02c5, B:169:0x025f, B:172:0x022d, B:175:0x023c, B:181:0x03d2, B:197:0x00f2, B:198:0x0083, B:204:0x009d, B:206:0x00a8, B:208:0x00ae, B:209:0x00b2, B:211:0x00c1, B:212:0x00c7, B:214:0x00cf, B:216:0x00d9, B:183:0x0127, B:188:0x0147, B:189:0x014c, B:191:0x0155, B:193:0x015c, B:40:0x0164, B:42:0x016d), top: B:2:0x0019, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ea A[Catch: all -> 0x03e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03e1, blocks: (B:3:0x0019, B:5:0x0027, B:8:0x0031, B:14:0x004b, B:15:0x0051, B:16:0x0058, B:18:0x0068, B:19:0x006e, B:21:0x0076, B:23:0x03d9, B:25:0x03e0, B:28:0x00e4, B:30:0x00f8, B:34:0x0106, B:37:0x011b, B:45:0x017b, B:47:0x0180, B:50:0x0193, B:53:0x019e, B:56:0x01a8, B:59:0x01b3, B:61:0x01b9, B:64:0x01c3, B:67:0x01cd, B:70:0x01d8, B:71:0x01de, B:72:0x01e4, B:73:0x01ea, B:75:0x01f0, B:77:0x01fb, B:81:0x020e, B:84:0x024b, B:87:0x0257, B:90:0x0270, B:93:0x027b, B:95:0x0281, B:98:0x028b, B:99:0x0292, B:102:0x029c, B:103:0x02a1, B:104:0x02a7, B:106:0x02ae, B:108:0x02b4, B:110:0x02cb, B:113:0x02d7, B:116:0x02e2, B:118:0x02fb, B:121:0x030b, B:124:0x0314, B:125:0x031a, B:126:0x0321, B:127:0x0328, B:130:0x0332, B:133:0x033b, B:135:0x034b, B:137:0x0354, B:139:0x035c, B:142:0x036a, B:144:0x0371, B:148:0x037d, B:149:0x0383, B:150:0x0389, B:151:0x0390, B:153:0x0395, B:156:0x039d, B:158:0x03a5, B:160:0x02ea, B:163:0x02f5, B:164:0x03b8, B:165:0x02ba, B:168:0x02c5, B:169:0x025f, B:172:0x022d, B:175:0x023c, B:181:0x03d2, B:197:0x00f2, B:198:0x0083, B:204:0x009d, B:206:0x00a8, B:208:0x00ae, B:209:0x00b2, B:211:0x00c1, B:212:0x00c7, B:214:0x00cf, B:216:0x00d9, B:183:0x0127, B:188:0x0147, B:189:0x014c, B:191:0x0155, B:193:0x015c, B:40:0x0164, B:42:0x016d), top: B:2:0x0019, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0193 A[Catch: all -> 0x03e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03e1, blocks: (B:3:0x0019, B:5:0x0027, B:8:0x0031, B:14:0x004b, B:15:0x0051, B:16:0x0058, B:18:0x0068, B:19:0x006e, B:21:0x0076, B:23:0x03d9, B:25:0x03e0, B:28:0x00e4, B:30:0x00f8, B:34:0x0106, B:37:0x011b, B:45:0x017b, B:47:0x0180, B:50:0x0193, B:53:0x019e, B:56:0x01a8, B:59:0x01b3, B:61:0x01b9, B:64:0x01c3, B:67:0x01cd, B:70:0x01d8, B:71:0x01de, B:72:0x01e4, B:73:0x01ea, B:75:0x01f0, B:77:0x01fb, B:81:0x020e, B:84:0x024b, B:87:0x0257, B:90:0x0270, B:93:0x027b, B:95:0x0281, B:98:0x028b, B:99:0x0292, B:102:0x029c, B:103:0x02a1, B:104:0x02a7, B:106:0x02ae, B:108:0x02b4, B:110:0x02cb, B:113:0x02d7, B:116:0x02e2, B:118:0x02fb, B:121:0x030b, B:124:0x0314, B:125:0x031a, B:126:0x0321, B:127:0x0328, B:130:0x0332, B:133:0x033b, B:135:0x034b, B:137:0x0354, B:139:0x035c, B:142:0x036a, B:144:0x0371, B:148:0x037d, B:149:0x0383, B:150:0x0389, B:151:0x0390, B:153:0x0395, B:156:0x039d, B:158:0x03a5, B:160:0x02ea, B:163:0x02f5, B:164:0x03b8, B:165:0x02ba, B:168:0x02c5, B:169:0x025f, B:172:0x022d, B:175:0x023c, B:181:0x03d2, B:197:0x00f2, B:198:0x0083, B:204:0x009d, B:206:0x00a8, B:208:0x00ae, B:209:0x00b2, B:211:0x00c1, B:212:0x00c7, B:214:0x00cf, B:216:0x00d9, B:183:0x0127, B:188:0x0147, B:189:0x014c, B:191:0x0155, B:193:0x015c, B:40:0x0164, B:42:0x016d), top: B:2:0x0019, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c3 A[Catch: all -> 0x03e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03e1, blocks: (B:3:0x0019, B:5:0x0027, B:8:0x0031, B:14:0x004b, B:15:0x0051, B:16:0x0058, B:18:0x0068, B:19:0x006e, B:21:0x0076, B:23:0x03d9, B:25:0x03e0, B:28:0x00e4, B:30:0x00f8, B:34:0x0106, B:37:0x011b, B:45:0x017b, B:47:0x0180, B:50:0x0193, B:53:0x019e, B:56:0x01a8, B:59:0x01b3, B:61:0x01b9, B:64:0x01c3, B:67:0x01cd, B:70:0x01d8, B:71:0x01de, B:72:0x01e4, B:73:0x01ea, B:75:0x01f0, B:77:0x01fb, B:81:0x020e, B:84:0x024b, B:87:0x0257, B:90:0x0270, B:93:0x027b, B:95:0x0281, B:98:0x028b, B:99:0x0292, B:102:0x029c, B:103:0x02a1, B:104:0x02a7, B:106:0x02ae, B:108:0x02b4, B:110:0x02cb, B:113:0x02d7, B:116:0x02e2, B:118:0x02fb, B:121:0x030b, B:124:0x0314, B:125:0x031a, B:126:0x0321, B:127:0x0328, B:130:0x0332, B:133:0x033b, B:135:0x034b, B:137:0x0354, B:139:0x035c, B:142:0x036a, B:144:0x0371, B:148:0x037d, B:149:0x0383, B:150:0x0389, B:151:0x0390, B:153:0x0395, B:156:0x039d, B:158:0x03a5, B:160:0x02ea, B:163:0x02f5, B:164:0x03b8, B:165:0x02ba, B:168:0x02c5, B:169:0x025f, B:172:0x022d, B:175:0x023c, B:181:0x03d2, B:197:0x00f2, B:198:0x0083, B:204:0x009d, B:206:0x00a8, B:208:0x00ae, B:209:0x00b2, B:211:0x00c1, B:212:0x00c7, B:214:0x00cf, B:216:0x00d9, B:183:0x0127, B:188:0x0147, B:189:0x014c, B:191:0x0155, B:193:0x015c, B:40:0x0164, B:42:0x016d), top: B:2:0x0019, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.multiparticipant.MultiParticipantView.CfQ(X.JDB):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(565108081);
        super.onAttachedToWindow();
        RtcOmniGridView rtcOmniGridView = this.A09;
        if (rtcOmniGridView != null) {
            JKw jKw = this.A0F;
            11T.A0F(jKw, 0);
            rtcOmniGridView.A0G.A0L.add(jKw);
        }
        AbI.A1S(this, this.A0D);
        0FI.A0C(-1108199423, A06);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        GrL grL = (GrL) this.A0D.getValue();
        GrL.A00(grL, GOq.A0p(grL.A0K));
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1471041706);
        AbI.A1X(this.A0D);
        HVT hvt = this.A01;
        if (hvt == null) {
            11T.A0L("gridViewStateBinder");
            throw 0Q8.createAndThrow();
        }
        hvt.A00.A08(HIn.A00(), false);
        RtcOmniGridView rtcOmniGridView = this.A09;
        if (rtcOmniGridView != null) {
            JKw jKw = this.A0F;
            11T.A0F(jKw, 0);
            rtcOmniGridView.A0G.A0L.remove(jKw);
        }
        super.onDetachedFromWindow();
        0FI.A0C(1244178231, A06);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-363507188);
        super.onSizeChanged(i, i2, i3, i4);
        GrL grL = (GrL) this.A0D.getValue();
        GrL.A00(grL, GOq.A0p(grL.A0K));
        0FI.A0C(849619428, A06);
    }
}
