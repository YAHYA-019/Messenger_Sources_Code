package com.facebook.messaging.omnipicker;

import X.06Z;
import X.1BQ;
import X.1BV;
import X.1Lo;
import X.1pH;
import X.2M3;
import X.7zL;
import X.7zU;
import X.AbI;
import X.AbK;
import X.AbL;
import X.BLj;
import X.BP4;
import X.C00i;
import X.C00j;
import X.C06c;
import X.C0D1;
import X.C1557Alb;
import X.C9kO;
import X.CfB;
import X.D0B;
import X.DGQ;
import X.DIz;
import X.InterfaceC00633oW;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.omnipicker.datamodel.M4OmnipickerParam;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: OmnipickerActivity.class */
public class OmnipickerActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public 1pH A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public ThreadKey A05;
    public C1557Alb A06;
    public DIz A07;
    public final DGQ A0A = new D0B(this);
    public final C00i A09 = 1BQ.A02(68684);
    public final 2M3 A08 = new CfB(this, 3);

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
    /* JADX WARN: Failed to calculate best type for var: r331v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r331v0 ??
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
    /* JADX WARN: Not initialized variable reg: 331, insn: 0x0656: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r331 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:255:0x0647 */
    public static void A12(com.facebook.messaging.model.threadkey.ThreadKey r301, com.facebook.messaging.omnipicker.OmnipickerActivity r302) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.omnipicker.OmnipickerActivity.A12(com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.omnipicker.OmnipickerActivity):void");
    }

    public static void A15(OmnipickerActivity omnipickerActivity) {
        06Z BDe = omnipickerActivity.BDe();
        if (omnipickerActivity.A06 == null || !C0D1.A01(BDe)) {
            return;
        }
        C06c A0G = 7zL.A0G(BDe);
        A0G.A0I(omnipickerActivity.A06);
        C06c.A00(A0G, false);
        omnipickerActivity.A06 = null;
    }

    public static void A16(OmnipickerActivity omnipickerActivity) {
        06Z BDe = omnipickerActivity.BDe();
        if (BDe.A0U() >= 1) {
            BDe.A0w();
        } else {
            omnipickerActivity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028c A[Catch: Exception -> 0x0411, all -> 0x0422, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0411, blocks: (B:105:0x024d, B:106:0x0252, B:109:0x025e, B:112:0x0268, B:117:0x02c2, B:121:0x028c, B:123:0x0295, B:126:0x02a5, B:128:0x02ac, B:129:0x02b6, B:130:0x02bb, B:130:0x02bb, B:133:0x0276), top: B:104:0x024d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146 A[Catch: Exception -> 0x03cc, all -> 0x03e3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x03cc, blocks: (B:19:0x0106, B:20:0x010b, B:23:0x0117, B:26:0x0121, B:29:0x013e, B:31:0x017c, B:32:0x0181, B:37:0x0146, B:39:0x014f, B:42:0x015f, B:44:0x0166, B:45:0x0170, B:46:0x0175, B:46:0x0175, B:49:0x012f), top: B:18:0x0106, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0371  */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2b(androidx.fragment.app.Fragment r302) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.omnipicker.OmnipickerActivity.A2b(androidx.fragment.app.Fragment):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.A01;
        if (r0 != null) {
            r0.A06();
            this.A01 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [androidx.fragment.app.Fragment, X.Alb] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        FbUserSession A08 = AbL.A08(this);
        this.A00 = A08;
        this.A03 = 1Lo.A00(this, A08, 115765);
        setContentView(2132542839);
        this.A01 = 1pH.A02((ViewGroup) this.A08.AUH(), BDe(), (InterfaceC00633oW) null, true);
        if (bundle == null) {
            ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra("prepicked_users");
            BLj serializableExtra = getIntent().getSerializableExtra("entry_point");
            M4OmnipickerParam m4OmnipickerParam = (M4OmnipickerParam) getIntent().getParcelableExtra("extra_omnipicker_param");
            ImmutableList of = arrayList == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) arrayList);
            NavigationTrigger navigationTrigger = C1557Alb.A1B;
            C00j.A05("OmniPickerFragment.newInstance", 1442599732);
            try {
                ?? c1557Alb = new C1557Alb();
                C00j.A01(564029597);
                BP4 bp4 = BP4.UNKNOWN;
                if (serializableExtra != null) {
                    switch (serializableExtra.ordinal()) {
                        case 1:
                            bp4 = BP4.INBOX;
                            break;
                        case 2:
                            bp4 = BP4.INBOX_FAB;
                            break;
                        case 3:
                            bp4 = BP4.BROADCAST_FLOW;
                            break;
                        case 4:
                            bp4 = BP4.ONE_ON_ONE_THREAD_DETAILS;
                            break;
                        case 5:
                            bp4 = BP4.GROUP_THREAD_DETAILS_ADD;
                            break;
                        case 6:
                            bp4 = BP4.GROUP_THREAD_DETAILS_CREATE_NEW_GROUP;
                            break;
                        case 7:
                            bp4 = BP4.GROUP_THREAD_DETAILS_MEMBERSHIP_ADD;
                            break;
                        case 13:
                            bp4 = BP4.INBOX_THREAD_LONG_PRESS_MENU;
                            break;
                    }
                }
                c1557Alb.A0M = bp4;
                if (!c1557Alb.A0R.equals(of)) {
                    c1557Alb.A0R = of;
                    C1557Alb.A0E(c1557Alb);
                }
                c1557Alb.A0J = m4OmnipickerParam;
                AbI.A1I(7zU.A0D(this), (Fragment) c1557Alb, 2131366078);
                AbI.A1P((C9kO) this.A09.get(), 30);
            } catch (Throwable th) {
                C00j.A01(1327382279);
                throw th;
            }
        }
        MigColorScheme.A00(A2c(2131365413), AbI.A0d(this));
        AbK.A1D(this, this.A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.A04 = 1BV.A00(99984);
        this.A02 = 7zL.A0R(this, 17019);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A01;
        if (r0 == null || !r0.A07()) {
            C1557Alb c1557Alb = this.A06;
            if (c1557Alb != null) {
                c1557Alb.A1a(false);
                return;
            }
            DIz dIz = this.A07;
            if (dIz == null || !dIz.Bkd()) {
                A16(this);
            }
        }
    }
}
