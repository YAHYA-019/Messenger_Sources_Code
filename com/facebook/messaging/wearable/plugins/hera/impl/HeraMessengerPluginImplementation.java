package com.facebook.messaging.wearable.plugins.hera.impl;

import X.0OI;
import X.0fH;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2aI;
import X.4dB;
import X.4dH;
import X.7zN;
import X.7zO;
import X.9RQ;
import X.AVE;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C06404gp;
import X.C13m;
import X.DCy;
import X.HWQ;
import X.Ikt;
import X.J9O;
import X.JN7;
import X.LYs;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.wearable.common.comms.hera.host.applinks.AppLinksTransportProvider;
import com.facebook.wearable.common.comms.hera.host.applinks.DeviceType;
import com.facebook.wearable.common.comms.hera.host.applinks.LinkedDeviceManager;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraHost;
import com.facebook.wearable.common.comms.hera.shared.connectivity.RemoteRtcEndpointsMux;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImpl;
import com.facebook.wearable.common.comms.hera.shared.p000native.NativeLinkMultiplexer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* loaded from: HeraMessengerPluginImplementation.class */
public final class HeraMessengerPluginImplementation {
    public FbUserSession A00;
    public HWQ A01;
    public 9RQ A02;
    public JN7 A03;
    public AppLinksTransportProvider A04;
    public LinkedDeviceManager A05;
    public IHeraHost A06;
    public RemoteRtcEndpointsMux A07;
    public NativeLinkMultiplexer A08;
    public Boolean A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public Context A0D;
    public final Context A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final LYs A0I;
    public final Ikt A0J;
    public final List A0K;
    public final AtomicBoolean A0L;
    public final C01i A0M;
    public final C01i A0N;
    public final C01i A0O;
    public final C01i A0P;
    public final C01i A0Q;
    public final C01i A0R;
    public final Function1 A0S;
    public final Function1 A0T;
    public final 2aI A0U;
    public final 4dH A0V;

    public HeraMessengerPluginImplementation(Context context) {
        11T.A0F(context, 1);
        this.A0E = context;
        this.A0U = 7zN.A0y();
        this.A0L = 7zO.A15();
        this.A0V = new 4dB();
        C03i c03i = C03i.A02;
        this.A0Q = C01g.A00(c03i, J9O.A00);
        this.A0I = new LYs();
        0OI A1B = C13m.A1B();
        A1B.addAll(LinkedDeviceManager.DEFAULT_SUPPORTED_DEVICES);
        if (1Br.A07(C06404gp.A00).AZk(36322675862095625L)) {
            A1B.add(DeviceType.HAMMERHEAD);
        }
        this.A0K = C13m.A1C(A1B);
        this.A0P = C01g.A00(c03i, new DCy(this, 31));
        this.A0F = 1Bq.A00(116358);
        this.A01 = new HWQ();
        this.A0H = 1Bu.A01(context, 115760);
        this.A0G = 1Bu.A00(68737);
        this.A0J = new Ikt();
        this.A0S = new AVE(this, 5);
        this.A0T = new AVE(this, 6);
        this.A0M = C01g.A00(c03i, new DCy(this, 19));
        this.A0N = C01g.A00(c03i, new DCy(this, 20));
        this.A0R = C01g.A00(c03i, new DCy(this, 33));
        this.A0O = C01g.A00(c03i, new DCy(this, 21));
    }

    /* JADX WARN: Failed to calculate best type for var: r316v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r316v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 316, insn: 0x05dd: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r316 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:288:0x05dd */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013e A[Catch: all -> 0x05db, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x05db, blocks: (B:16:0x05a9, B:18:0x05af, B:20:0x05b6, B:22:0x05c2, B:23:0x0136, B:23:0x0136, B:31:0x045f, B:33:0x0465, B:37:0x0474, B:38:0x0479, B:38:0x0479, B:41:0x0480, B:43:0x0483, B:44:0x048a, B:47:0x0498, B:48:0x04a1, B:49:0x04a8, B:51:0x04b3, B:52:0x04b9, B:53:0x04c0, B:54:0x04c7, B:57:0x04d3, B:61:0x04e3, B:62:0x04e8, B:62:0x04e8, B:65:0x04ef, B:68:0x04fa, B:70:0x0500, B:71:0x0505, B:74:0x0511, B:75:0x0516, B:77:0x0524, B:81:0x0539, B:82:0x053e, B:82:0x053e, B:84:0x0543, B:86:0x0549, B:88:0x0554, B:89:0x055a, B:91:0x0563, B:93:0x056d, B:95:0x0576, B:101:0x058e, B:103:0x0594, B:104:0x0599, B:106:0x05a1, B:108:0x0118, B:109:0x011e, B:113:0x0131, B:114:0x013e, B:115:0x0144, B:119:0x0157, B:120:0x015f, B:121:0x0164, B:122:0x016b, B:123:0x0174, B:124:0x017b, B:127:0x0187, B:128:0x018c, B:130:0x019a, B:132:0x01a3, B:134:0x01aa, B:135:0x01ad, B:135:0x01ad, B:138:0x01b9, B:139:0x01bf, B:139:0x01bf, B:141:0x01c4, B:143:0x01cd, B:145:0x01da, B:147:0x01e2, B:149:0x01e9, B:151:0x01f6, B:153:0x01fe, B:155:0x0205, B:157:0x0212, B:159:0x021a, B:161:0x0221, B:163:0x022e, B:165:0x0236, B:167:0x023d, B:169:0x0245, B:171:0x024c, B:172:0x0252, B:173:0x0256, B:173:0x0256, B:175:0x025b, B:176:0x0262, B:178:0x0270, B:180:0x027a, B:182:0x0286, B:183:0x028f, B:185:0x0296, B:187:0x02a2, B:188:0x02aa, B:188:0x02aa, B:190:0x02af, B:192:0x02bd, B:194:0x02c7, B:196:0x02cd, B:198:0x02d3, B:199:0x02d8, B:202:0x032a, B:203:0x0330, B:204:0x0337, B:205:0x033d, B:207:0x0348, B:209:0x034f, B:210:0x0353, B:211:0x0358, B:211:0x0358, B:214:0x0361, B:216:0x036b, B:217:0x0370, B:217:0x0370, B:220:0x0377, B:221:0x037e, B:223:0x0386, B:225:0x0394, B:227:0x039a, B:231:0x03a9, B:232:0x03ae, B:232:0x03ae, B:235:0x03b5, B:237:0x03b8, B:238:0x03bf, B:240:0x03c6, B:241:0x03cc, B:243:0x03d2, B:244:0x03d7, B:245:0x03de, B:246:0x03e5, B:247:0x03f5, B:248:0x03fc, B:250:0x0403, B:251:0x0409, B:253:0x040f, B:256:0x041e, B:258:0x0425, B:259:0x042b, B:260:0x0430, B:260:0x0430, B:263:0x0437, B:264:0x043d, B:266:0x0448, B:267:0x044e, B:272:0x038e, B:273:0x02e2, B:274:0x02eb, B:275:0x02f2, B:276:0x02f9, B:277:0x0302, B:278:0x0309, B:281:0x0315, B:282:0x031d), top: B:7:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation.A00(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation.A01(com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation, X.0DR):java.lang.Object");
    }

    public static final void A02(Context context, HeraMessengerPluginImplementation heraMessengerPluginImplementation) {
        HeraHostSharedImpl heraHostSharedImpl;
        heraMessengerPluginImplementation.A0D = context;
        IHeraHost iHeraHost = heraMessengerPluginImplementation.A06;
        if (!(iHeraHost instanceof HeraHostSharedImpl) || (heraHostSharedImpl = (HeraHostSharedImpl) iHeraHost) == null) {
            0fH.A0n("Hera.MsgrPluginImpl", "Can not attach UI context as call engine is not initialized.");
        } else {
            heraHostSharedImpl.getEngine().setActivityContext(heraMessengerPluginImplementation.A0E);
        }
    }
}
