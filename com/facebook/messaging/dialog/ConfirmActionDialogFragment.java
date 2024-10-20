package com.facebook.messaging.dialog;

import X.0D2;
import X.0FI;
import X.1JF;
import X.1iF;
import X.2Ov;
import X.AbF;
import X.AbJ;
import X.C5Q;
import X.CSG;
import X.DIS;
import X.DR6;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.authapplock.setting.SendToSettingsDialogFragment;
import com.facebook.messaging.bubbles.dialogs.NotificationPermissionAlertDialog;
import com.facebook.messaging.deletemessage.ui.DeleteMessagesDialogFragment;
import com.facebook.messaging.deletemessage.ui.UnsendMessageDialogFragment;
import com.facebook.messaging.mutators.DeleteThreadDialogFragment;
import com.facebook.messaging.sharedcontent.plugins.files.tabcontent.DownloadFileDialogFragment;
import com.facebook.messaging.threadlist.threaditemmenu.plugins.core.markreadmenuitem.ConfirmReadDialog;
import com.facebook.orca.threadview.DownloadAttachmentDialogFragment;

/* loaded from: ConfirmActionDialogFragment.class */
public abstract class ConfirmActionDialogFragment extends 2Ov {
    public ConfirmActionParams A00;

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        this.A00.getClass();
        ConfirmActionParams confirmActionParams = this.A00;
        String str = confirmActionParams.A06;
        String str2 = confirmActionParams.A03;
        String str3 = confirmActionParams.A05;
        String str4 = confirmActionParams.A04;
        String str5 = confirmActionParams.A02;
        boolean z = confirmActionParams.A07;
        DR6 A02 = AbJ.A0c().A02(getContext());
        if (1JF.A0B(str2)) {
            A02.A0J(str);
        } else {
            A02.A03(str);
            A02.A0J(str2);
        }
        CSG.A02(A02, str3, this, 63);
        if (str4 != null) {
            A02.A0F(CSG.A00(this, 64), str4);
        }
        CSG A00 = CSG.A00(this, 65);
        if (str5 != null) {
            A02.A0E(A00, str5);
        } else if (!z) {
            A02.A08(A00);
        }
        return A02.A04();
    }

    public 1iF A17() {
        if (this instanceof DownloadAttachmentDialogFragment) {
            return AbF.A0C(621497308797881L);
        }
        if (this instanceof ConfirmReadDialog) {
            return AbF.A0C(1365574523639082L);
        }
        if (!(this instanceof DownloadFileDialogFragment) && !(this instanceof com.facebook.messaging.sharedcontent.plugins.advancedcryptofiles.tabcontent.DownloadFileDialogFragment)) {
            if (!(this instanceof UnsendMessageDialogFragment) && !(this instanceof DeleteMessagesDialogFragment)) {
                return this instanceof NotificationPermissionAlertDialog ? AbF.A0C(3286609771391238L) : this instanceof SendToSettingsDialogFragment ? AbF.A0C(796330954455679L) : AbF.A0C(211046320551505L);
            }
            return AbF.A0C(669991743726852L);
        }
        return AbF.A0C(598103277737659L);
    }

    public void A1C() {
        A0o();
    }

    public void A1D() {
        if ((this instanceof DownloadAttachmentDialogFragment) || (this instanceof DownloadFileDialogFragment) || (this instanceof com.facebook.messaging.sharedcontent.plugins.advancedcryptofiles.tabcontent.DownloadFileDialogFragment)) {
            ((0D2) this).A0p();
            return;
        }
        if (this instanceof DeleteThreadDialogFragment) {
            DeleteThreadDialogFragment deleteThreadDialogFragment = (DeleteThreadDialogFragment) this;
            C5Q c5q = deleteThreadDialogFragment.A07;
            FbUserSession fbUserSession = deleteThreadDialogFragment.A00;
            fbUserSession.getClass();
            if (c5q.A00(fbUserSession)) {
                DeleteThreadDialogFragment.A08(deleteThreadDialogFragment);
            } else if (deleteThreadDialogFragment.A06 != null) {
                DIS dis = deleteThreadDialogFragment.A05;
                if (dis != null) {
                    dis.Bsz();
                }
                deleteThreadDialogFragment.A0o();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e9, code lost:
    
        if (X.0CU.A0T(X.4YU.A18(r0, r0), "video", false) == true) goto L53;
     */
    /* JADX WARN: Failed to calculate best type for var: r313v0 ??
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
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:558)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r313v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r313v0 ??
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
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:555)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r313v0 ??
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
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
    	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
    	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
    	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 313, insn: 0x0510: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r313 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:225:0x0510 */
    /* JADX WARN: Type inference failed for: r0v237, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v275, types: [androidx.fragment.app.Fragment, com.facebook.orca.threadview.DownloadAttachmentDialogFragment] */
    /* JADX WARN: Type inference failed for: r0v85, types: [com.facebook.messaging.deletemessage.ui.UnsendMessageDialogFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r301v0, types: [com.facebook.messaging.dialog.ConfirmActionDialogFragment] */
    /* JADX WARN: Type inference failed for: r306v10, types: [com.facebook.messaging.sharedcontent.plugins.files.tabcontent.DownloadFileDialogFragment] */
    /* JADX WARN: Type inference failed for: r313v0, types: [com.facebook.fury.context.ReqContext] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1E() {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.dialog.ConfirmActionDialogFragment.A1E():void");
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1977348381);
        super.onCreate(bundle);
        0FI.A08(913647864, A02);
    }
}
