package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: A4w.class */
public final class A4w implements 7NG {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final HighlightsFeedContent A0A;
    public final AaX A0B;
    public final 9JN A0C;
    public final C01i A0D;
    public final Activity A0E;
    public final 06Z A0F;

    public A4w(Activity activity, Context context, 06Z r304, FbUserSession fbUserSession, HighlightsFeedContent highlightsFeedContent, AaX aaX) {
        7zR.A1N(context, fbUserSession);
        this.A00 = context;
        this.A0A = highlightsFeedContent;
        this.A01 = fbUserSession;
        this.A0F = r304;
        this.A0E = activity;
        this.A0B = aaX;
        this.A09 = 1Bq.A00(16461);
        this.A07 = 1HG.A00(context, 65898);
        this.A06 = 1Bq.A00(16462);
        this.A05 = 1Bq.A00(84488);
        this.A03 = 7zM.A0d();
        this.A04 = 1Bq.A00(65609);
        this.A08 = 1Bu.A00(147971);
        this.A02 = 1Bu.A00(68365);
        this.A0D = C01g.A01(AQl.A01(this, 43));
        this.A0C = new 9JN((9Gk) C1Y6.A00(context, "com_facebook_messaging_highlightstab_xsharelibraries_composer_sender_plugins_interfaces_preprocessor_HTMessagePreprocessorInterfaceSpec", "All", new Object[]{highlightsFeedContent}));
    }

    public static final void A00(FbUserSession fbUserSession, A4w a4w, Message message, NavigationTrigger navigationTrigger, C5fv c5fv, String str) {
        ListenableFuture A0H = ((C5Pr) 1Lm.A05(a4w.A00, fbUserSession, 49712)).A0H(HHk.A00(str), message, navigationTrigger, String.valueOf(navigationTrigger));
        1Br.A0D(a4w.A09, new ABt(8, fbUserSession, c5fv, a4w), A0H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b2, code lost:
    
        if (r305 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(com.facebook.auth.usersession.FbUserSession r301, X.A4w r302, com.facebook.messaging.model.messages.Message r303, X.C5fv r304) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A4w.A01(com.facebook.auth.usersession.FbUserSession, X.A4w, com.facebook.messaging.model.messages.Message, X.5fv):void");
    }

    public static final void A02(A4w a4w) {
        Activity activity;
        AaX aaX = a4w.A0B;
        if (aaX != null) {
            aaX.C76();
        }
        if (C1ub.A03.A08() == C1yN.A03 || !C1ub.A00().AZk(36321636495606414L) || (activity = a4w.A0E) == null) {
            return;
        }
        K8M.A01(7zM.A0F(activity), a4w.A00.getString(2131959814), 0).A06();
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r335v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r335v0 ??
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
    /* JADX WARN: Not initialized variable reg: 335, insn: 0x044c: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r335 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:280:0x044c */
    public void Ckp(com.facebook.messaging.model.messages.Message r302, com.facebook.messaging.model.threadkey.ThreadKey r303, com.facebook.messaging.send.trigger.NavigationTrigger r304, X.C5fv r305, java.lang.String r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 2836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A4w.Ckp(com.facebook.messaging.model.messages.Message, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.send.trigger.NavigationTrigger, X.5fv, java.lang.String, boolean):void");
    }
}
