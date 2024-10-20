package X;

import android.content.Context;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.viewer.reaction.MontageMessageReactionViewModel;
import com.facebook.messaging.montage.viewer.reaction.MontageViewerReactionsOverlayView;
import com.facebook.presence.note.ui.consumption.reactions.NotesReactionsManager;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: A23.class */
public final class A23 implements AaC {
    public final /* synthetic */ 8Gm A00;

    public A23(8Gm r302) {
        this.A00 = r302;
    }

    @Override // X.AaC
    public void C0j(int i) {
        int i2;
        Window window;
        8Gm r0 = this.A00;
        if (r0.A0B) {
            7zT.A1A(r0);
            i2 = 0;
        } else {
            8Gm.A03(r0);
            FragmentActivity activity = r0.getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(32);
            }
            i2 = i + 7zO.A0D(r0).getDimensionPixelSize(2132279386);
        }
        LinearLayout linearLayout = r0.A01;
        if (linearLayout != null) {
            linearLayout.setPadding(0, 0, 0, i2);
        }
        r0.A0B = !r0.A0B;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.5fq, X.5qu] */
    @Override // X.AaC
    public void CFO(8K0 r302, String str) {
        String str2;
        Object obj;
        11T.A0F(r302, 1);
        8Gm r0 = this.A00;
        Context context = r0.A00;
        if (context == null) {
            str2 = "context";
        } else {
            FbUserSession fbUserSession = r0.A02;
            if (fbUserSession == null) {
                str2 = "fbUserSession";
            } else {
                FragmentActivity activity = r0.getActivity();
                String valueOf = String.valueOf(r302.A00);
                if (7zQ.A0p().A00.AZk(72340842837381362L)) {
                    NotesReactionsManager A15 = 7zN.A0C(609).A15(context, fbUserSession);
                    07S A0J = 4YU.A0J(GraphQlCallInput.A02, valueOf, 1BJ.A00(499));
                    switch (str.hashCode()) {
                        case 377643:
                            if (str.equals("❤️")) {
                                obj = "LOVE";
                                break;
                            }
                            obj = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                            break;
                        case 1772464:
                            if (str.equals("��")) {
                                obj = "LIKE";
                                break;
                            }
                            obj = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                            break;
                        case 1772905:
                            if (str.equals("��")) {
                                obj = "HAHA";
                                break;
                            }
                            obj = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                            break;
                        case 1772931:
                            if (str.equals("��")) {
                                obj = "ANGRY";
                                break;
                            }
                            obj = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                            break;
                        case 1772933:
                            if (str.equals("��")) {
                                obj = "SAD";
                                break;
                            }
                            obj = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                            break;
                        case 1772945:
                            if (str.equals("��")) {
                                obj = "WOW";
                                break;
                            }
                            obj = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                            break;
                        default:
                            obj = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                            break;
                    }
                    GraphQlQueryParamSet A0N = 4YU.A0N(A0J, obj, "reaction_type");
                    4YV.A1A(A0J, A0N, "params");
                    1VX.A0E(A15.A00, A15.A01).A09(5Dh.A00(A0N, new C01643sd(8Iu.class, "FbMsgrNoteSendReactionMutation", null, null, "fbandroid", -624855668, 0, 335309838L, 335309838L, false, true)));
                } else {
                    ThreadKey threadKey = r302.A01;
                    if (threadKey != null) {
                        7NH A0W = 7zV.A0W(threadKey, r302.A02, new A4v(context, activity, r302, null, "notes_consumption", true), 1Bn.A0E(context, (1BY) null, 68357));
                        String A0s = 4YU.A0s();
                        ?? c5fq = new C5fq();
                        c5fq.A04("");
                        c5fq.A02 = str;
                        c5fq.A0B = A0s;
                        A0W.Ckr((AnonymousClass539) null, new 5gC((C5qu) c5fq), "unknown", (String) null);
                    }
                }
                r0.A0C = true;
                8Kc r02 = r0.A06;
                if (r02 != null) {
                    HU3 hu3 = new HU3(new MontageMessageReactionViewModel(r02.A05.A0k, str, ((C9hd) 1Bn.A0A(68150)).A00(str)));
                    MontageViewerReactionsOverlayView montageViewerReactionsOverlayView = r0.A04;
                    if (montageViewerReactionsOverlayView != null) {
                        montageViewerReactionsOverlayView.A0V(hu3);
                        return;
                    }
                    return;
                }
                str2 = "consumptionViewDataModel";
            }
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    @Override // X.AaC
    public void CGf() {
        String str;
        8Gm r0 = this.A00;
        r0.A0C = true;
        9Yr r02 = r0.A08;
        if (r02 == null) {
            str = "seenStateOperator";
        } else {
            8Kc r03 = r0.A06;
            if (r03 == null) {
                str = "consumptionViewDataModel";
            } else {
                long j = r03.A03.A04;
                C03513yC c03513yC = r0.A05;
                if (c03513yC != null) {
                    r02.A00(j, c03513yC.A00, 2);
                    return;
                }
                str = "notesLogger";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
