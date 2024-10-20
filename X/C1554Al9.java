package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* renamed from: X.Al9, reason: case insensitive filesystem */
/* loaded from: Al9.class */
public final class C1554Al9 extends 1pK {
    public static final String __redex_internal_original_name = "SuggestedChatRequestsFragment";
    public FbUserSession A00;
    public 1pI A01;
    public LithoView A02;
    public 1F9 A03;
    public 6KV A04;
    public final C01i A07;
    public final C01i A08;
    public final C01i A09;
    public final C0P A0A;
    public final 1Br A06 = 1Bu.A02(this, 82785);
    public final 1Br A05 = 7zN.A0I(this);

    /* JADX WARN: Multi-variable type inference failed */
    public C1554Al9() {
        C03i c03i = C03i.A02;
        this.A07 = C01g.A00(c03i, new AKM(this, 39));
        this.A09 = C01g.A00(c03i, new AKM(this, 41));
        this.A08 = C01g.A00(c03i, new AKM(this, 40));
        this.A0A = new C0P(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0458 A[Catch: Exception -> 0x04d7, all -> 0x04ec, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x04d7, blocks: (B:179:0x0423, B:180:0x0428, B:183:0x0434, B:186:0x043e, B:189:0x0458, B:191:0x0467, B:193:0x046d, B:196:0x0477, B:198:0x0482, B:200:0x048d, B:201:0x0494, B:203:0x04a5, B:204:0x04ac, B:205:0x04b1, B:205:0x04b1, B:208:0x04b8, B:214:0x04c6, B:216:0x044c), top: B:178:0x0423, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0116 A[Catch: Exception -> 0x0186, all -> 0x01a0, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0186, blocks: (B:13:0x00e1, B:14:0x00e6, B:17:0x00f2, B:20:0x00fc, B:23:0x0116, B:25:0x0125, B:27:0x012b, B:30:0x0137, B:31:0x013e, B:32:0x0145, B:34:0x014e, B:35:0x0155, B:36:0x015a, B:36:0x015a, B:39:0x0161, B:40:0x0175, B:46:0x0169, B:48:0x0170, B:50:0x010a), top: B:12:0x00e1, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r0v169, types: [X.2qQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v178, types: [X.2qQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r316v1 */
    /* JADX WARN: Type inference failed for: r316v11 */
    /* JADX WARN: Type inference failed for: r316v12 */
    /* JADX WARN: Type inference failed for: r316v2 */
    /* JADX WARN: Type inference failed for: r316v3 */
    /* JADX WARN: Type inference failed for: r316v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.1LI A03(X.C1554Al9 r301, java.util.List r302) {
        /*
            Method dump skipped, instructions count: 1556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1554Al9.A03(X.Al9, java.util.List):X.1LI");
    }

    public static final void A06(C1554Al9 c1554Al9) {
        C70 c70 = (C70) 1Br.A0B(c1554Al9.A06);
        FbUserSession fbUserSession = c1554Al9.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        c70.A00(fbUserSession, AnonymousClass001.A05(c1554Al9.A07.getValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 1BM.A01(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2054943032);
        LithoView A0M = 7zR.A0M(this);
        this.A02 = A0M;
        0FI.A08(2126353254, A02);
        return A0M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        String str;
        int A02 = 0FI.A02(-805577924);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A02 = null;
        6KV r0 = this.A04;
        if (r0 == null) {
            str = "viewOrientationLockHelper";
        } else {
            r0.A05(-1);
            C70 c70 = (C70) 1Br.A0B(this.A06);
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession != null) {
                CEb cEb = (CEb) 1Br.A0B(c70.A00);
                if (cEb.A01 != null) {
                    1Uj r02 = (1Uj) 4YU.A0o(fbUserSession, cEb.A03, 16686);
                    C1qM c1qM = cEb.A01;
                    11T.A0I(c1qM, "null cannot be cast to non-null type com.facebook.msys.mca.Mailbox.StoredProcedureChangedListener");
                    C21S.A01(c1qM, r02);
                }
                0FI.A08(-2143253226, A02);
                return;
            }
            str = "fbUserSession";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        LithoView lithoView;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        6KV A00 = ((82O) 1Bn.A0A(65571)).A00(requireContext());
        this.A04 = A00;
        A00.A02();
        this.A01 = 1vD.A00(view);
        1F9 serializable = requireArguments().getSerializable("folder_name");
        11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.messaging.model.folders.FolderName");
        this.A03 = serializable;
        1LI axO = new AxO(A03(this, C0ty.A00), 7zQ.A0m(this.A05), CxE.A00(this, 37), false);
        if (getContext() != null && isAdded() && (lithoView = this.A02) != null) {
            lithoView.A0y(axO);
        }
        if (7zQ.A1a(this.A08)) {
            C70 c70 = (C70) 1Br.A0B(this.A06);
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession == null) {
                7zL.A1C();
                throw 0Q8.createAndThrow();
            }
            c70.A01(fbUserSession, new AKM(this, 42));
        } else {
            A06(this);
        }
        CaE.A03(getViewLifecycleOwner(), ((CEb) 1Br.A0B(((C70) 1Br.A0B(this.A06)).A00)).A02, this, 74);
    }
}
