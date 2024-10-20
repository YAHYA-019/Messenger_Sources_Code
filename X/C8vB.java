package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.nativepagereply.faq.creation.BusinessInboxFAQCreationActivity;
import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8vB, reason: invalid class name */
/* loaded from: 8vB.class */
public final class C8vB extends BJB {
    public static final String __redex_internal_original_name = "BusinessInboxFAQSettingFragment";
    public C6oc A00;
    public String A01;
    public final 1Br A03 = 1HG.A01(this, 65728);
    public final C01i A06 = C01g.A01(new AKO(this, 35));
    public final 1Br A04 = 1HG.A01(this, 99435);
    public final 1Br A02 = 1Bu.A02(this, 68329);
    public final Rqp A05 = new Rqp(this);

    public static final ImmutableList A03(ImmutableList immutableList, ImmutableList immutableList2) {
        11T.A0F(immutableList, 0);
        ArrayList A17 = 1BK.A17(immutableList2);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A17.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = (String) next;
            if (!(immutableList instanceof Collection) || !immutableList.isEmpty()) {
                Iterator it2 = immutableList.iterator();
                while (it2.hasNext()) {
                    if (11T.A0O(((AutomatedResponseCustomQuestionModel) it2.next()).A03, str)) {
                        break;
                    }
                }
            }
            if (!1JF.A0A(str)) {
                A0s.add(next);
            }
        }
        return 1BL.A0a(A0s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r307 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r305 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A06(com.google.common.collect.ImmutableList r302, java.lang.Boolean r303) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8vB.A06(com.google.common.collect.ImmutableList, java.lang.Boolean):void");
    }

    public 1iF A1R() {
        return new 1iF(367103207806489L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0048, code lost:
    
        if (r306 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super.A1S(r1)
            r0 = r301
            com.facebook.auth.usersession.FbUserSession r0 = X.1BM.A01(r0)
            r303 = r0
            r0 = 68134(0x10a26, float:9.5476E-41)
            r304 = r0
            r0 = r301
            r1 = r303
            r2 = r304
            java.lang.Object r0 = X.7zN.A0n(r0, r1, r2)
            X.6oc r0 = (X.C6oc) r0
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A00 = r1
            r0 = r301
            X.01i r0 = r0.A06
            java.lang.Object r0 = X.7zM.A1B(r0)
            X.1PA r0 = (X.1PA) r0
            r305 = r0
            r0 = r305
            r0.A00()
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4b
            java.lang.String r0 = "arg_entry_point"
            r305 = r0
            r0 = r303
            r1 = r305
            java.lang.String r0 = r0.getString(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L50
        L4b:
            java.lang.String r0 = "unknown"
            r306 = r0
        L50:
            r0 = r301
            r1 = r306
            r0.A01 = r1
            r0 = r301
            X.6oc r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L6c
            java.lang.String r0 = "faqDetailsStorageHandler"
            r305 = r0
        L63:
            r0 = r305
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L6c:
            java.lang.String r0 = "entryPoint"
            r305 = r0
            r0 = r303
            r1 = r306
            r0.A03(r1)
            r0 = r301
            java.lang.String r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L63
            r0 = r301
            X.1Br r0 = r0.A02
            X.9lJ r0 = X.7zP.A0c(r0)
            r1 = r303
            r0.A05(r1)
            r0 = r301
            r1 = 0
            r2 = 0
            r0.A06(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8vB.A1S(android.os.Bundle):void");
    }

    public void A1c() {
        A1b();
        A1e(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A1d(AutomatedResponseCustomQuestionModel automatedResponseCustomQuestionModel, String str) {
        C08d A0W = 1BK.A0W();
        Intent putExtra = C3o5.A0D(getContext(), BusinessInboxFAQCreationActivity.class).putExtra("faq_creation_activity_mode", str);
        String str2 = this.A01;
        if (str2 == null) {
            11T.A0L("entryPoint");
            throw 0Q8.createAndThrow();
        }
        A0W.A0A(getContext(), putExtra.putExtra(AbE.A00(23), str2).putExtra("faq_creation_activity_editing_faq_model", automatedResponseCustomQuestionModel));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (r311 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        if (r303 == null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1e(boolean r302) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8vB.A1e(boolean):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 911738725);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(1072421027, A04);
        return A0J;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(417870347);
        ((1PA) 7zM.A1B(this.A06)).A01();
        super/*X.DZJ*/.onDestroy();
        0FI.A08(-746632261, A02);
    }
}
