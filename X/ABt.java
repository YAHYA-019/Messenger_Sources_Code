package X;

import androidx.lifecycle.LiveData;
import com.facebook.acra.constants.ActionId;
import com.facebook.presence.note.ui.creation.NotesCreationFragment;
import kotlin.jvm.functions.Function1;

/* loaded from: ABt.class */
public final class ABt implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ABt(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onFailure(Throwable th) {
        C00m c00m;
        Function1 function1;
        Object obj;
        C95z c95z;
        switch (this.A00) {
            case 1:
                11T.A0F(th, 0);
                0fH.A0s("CommunityHighlightsContentQueryUtil", "CommunityHighlightsContentQuery graphql failed", th);
                c00m = (C00m) this.A01;
                c00m.invoke();
                return;
            case 2:
                0fH.A0u("friends_tab", AbstractC00603o4.A00(ActionId.RTMP_CONNECTION_REQUESTED), th);
                return;
            case 3:
                11T.A0F(th, 0);
                0fH.A0p("ThreadSettingSharedContentView", "Failed to load open thread key for armadillo thread pk, exception thrown", th);
                c00m = (C00m) this.A02;
                if (c00m == null) {
                    return;
                }
                c00m.invoke();
                return;
            case 4:
                0fH.A0j(AbE.A00(261), "fetch thread key failure");
                return;
            case 5:
                11T.A0F(th, 0);
                0fH.A0v(1BJ.A00(269), 1BJ.A00(739), th);
                ((1FX) this.A02).set(C2i8.A01((C2i8) this.A03, (37O) this.A01));
                return;
            case 6:
                11T.A0F(th, 0);
                LiveData liveData = (LiveData) this.A02;
                if (th instanceof DpH) {
                    switch (((DpH) th).error.code) {
                        case 1545035:
                            c95z = C95z.A04;
                            break;
                        case 2055004:
                        case 2055006:
                        case 2055011:
                            c95z = C95z.A03;
                            break;
                    }
                    liveData.postValue(c95z);
                    return;
                }
                c95z = C95z.A02;
                liveData.postValue(c95z);
                return;
            case 7:
                1Br r0 = ((9Yb) this.A03).A00;
                ((C6mh) 1Br.A0B(r0)).A01();
                ((C6mh) 1Br.A0B(r0)).A0A("error_connection");
                ((Aa4) this.A02).D0J(C95z.A02);
                return;
            case 8:
                11T.A0F(th, 0);
                0fH.A0r("HighlightsTabComposerMessageSender", "Send message failure", th);
                AaX aaX = ((A4w) this.A03).A0B;
                if (aaX != null) {
                    aaX.C75();
                    return;
                }
                return;
            case 9:
                ((I43) this.A01).A0C.AS6(th);
                return;
            case 10:
                9gU r02 = (9gU) this.A03;
                9XO r03 = (9XO) 1Br.A0B(r02.A07);
                7zV.A16(1Br.A02(r03.A00), "qr_code_thread_id_retrieval_fail", r02.A0B);
                function1 = (Function1) this.A01;
                obj = this.A02;
                function1.invoke(obj);
                return;
            case 11:
                function1 = (Function1) this.A01;
                obj = 1BK.A0d();
                function1.invoke(obj);
                return;
            case 12:
                8LZ.A02((8LZ) this.A02, (NotesCreationFragment) this.A03, false);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0782, code lost:
    
        if (r0 != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x085b, code lost:
    
        if (r320 == null) goto L149;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0aa9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2993
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABt.onSuccess(java.lang.Object):void");
    }
}
