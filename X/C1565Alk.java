package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.model.ChannelMember;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType;
import com.facebook.messaging.communitymessaging.model.Member;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.Alk, reason: case insensitive filesystem */
/* loaded from: Alk.class */
public final class C1565Alk extends 1pK implements 1pN {
    public static final String __redex_internal_original_name = "OmnipickerRealtimeMemberSearchFragment";
    public FbUserSession A00;
    public 1pI A01;
    public LithoView A02;
    public Rl0 A03;
    public ThreadKey A04;
    public ThreadSummary A05;
    public CIq A06;
    public C5ic A07;
    public MigColorScheme A08;
    public Integer A09;
    public Long A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public 22F A0G;
    public CommunityMessagingFbGroupType A0H;
    public final C2kx A0P = new C2kx();
    public final 1Br A0N = 1Bu.A00(82369);
    public final 1Br A0L = 1Bq.A00(83395);
    public final C1E A0T = (C1E) 1Bi.A03(83397);
    public final 1Br A0M = 7zM.A0O();
    public final 1Br A0K = 1Bq.A00(83396);
    public boolean A0F = true;
    public ArrayList A0J = AnonymousClass001.A0s();
    public ArrayList A0I = AnonymousClass001.A0s();
    public final CoD A0X = new CoD(this, 1);
    public final DEO A0V = new CsC(this, 0);
    public final C0F A0S = new C0F(this);
    public final Co3 A0R = new Co3();
    public final C1371Afd A0O = new C1371Afd(0);
    public final Co8 A0Q = new Co8();
    public final CoB A0W = new CoB(this, 0);
    public final 2Yl A0U = CpT.A00;

    /* JADX WARN: Code restructure failed: missing block: B:103:0x03f2, code lost:
    
        if (r306 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0411, code lost:
    
        if (r306 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e1, code lost:
    
        if (r0 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0187, code lost:
    
        if (r0.A03 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x031c, code lost:
    
        if (r304 != false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.B0T A03(X.1Iw r301, X.C1565Alk r302, com.google.common.collect.ImmutableList r303, boolean r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1565Alk.A03(X.1Iw, X.Alk, com.google.common.collect.ImmutableList, boolean, boolean):X.B0T");
    }

    public static final void A06(LithoView lithoView, C1565Alk c1565Alk) {
        ViewGroup.LayoutParams layoutParams = lithoView.getLayoutParams();
        if (layoutParams != null) {
            int i = -1;
            if (c1565Alk.A0F) {
                i = -2;
            }
            layoutParams.height = i;
            lithoView.getParent();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A07(C1565Alk c1565Alk) {
        String str;
        LithoView lithoView = c1565Alk.A02;
        if (lithoView != null) {
            View A00 = BRu.A00(lithoView, "omnipicker_search_bar_tag");
            if (A00 != null) {
                7zT.A13(c1565Alk.requireContext(), A00);
            }
            LithoView lithoView2 = c1565Alk.A02;
            if (lithoView2 != null) {
                TextView textView = (TextView) BRu.A00(lithoView2, "omnipicker_search_bar_tag");
                if (textView != null) {
                    textView.setText("");
                }
                Rl0 rl0 = c1565Alk.A03;
                str = "viewModelController";
                if (rl0 != null) {
                    AfX afX = (AfX) rl0.A0D.getValue();
                    MutableLiveData mutableLiveData = afX.A00;
                    if (!11T.A0O(mutableLiveData.getValue(), false)) {
                        7zS.A1C(mutableLiveData, afX.A03, false);
                    }
                    Rl0 rl02 = c1565Alk.A03;
                    if (rl02 != null) {
                        ((AfX) rl02.A0D.getValue()).A00("");
                        Rl0 rl03 = c1565Alk.A03;
                        if (rl03 != null) {
                            ((AfX) rl03.A0D.getValue()).A02.postValue(null);
                            return;
                        }
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        }
        str = "contentView";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A08(C1565Alk c1565Alk) {
        CIq cIq = c1565Alk.A06;
        String str = "impressionItemAccumulator";
        if (cIq != null) {
            ImmutableList A02 = cIq.A02();
            11T.A0A(A02);
            Integer num = c1565Alk.A09;
            if (num == null) {
                str = "searchSurfaceType";
            } else {
                if (num == 0S2.A00) {
                    CQ4 cq4 = (CQ4) 1Br.A0B(c1565Alk.A0L);
                    Rl0 rl0 = c1565Alk.A03;
                    if (rl0 == null) {
                        str = "viewModelController";
                    } else {
                        String str2 = rl0.A02;
                        if (str2 == null) {
                            str2 = "";
                        }
                        cq4.A08(str2, A02);
                    }
                }
                CIq cIq2 = c1565Alk.A06;
                if (cIq2 != null) {
                    cIq2.A0B.clear();
                    return;
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A09(C1565Alk c1565Alk, DK4 dk4, User user, int i, int i2) {
        CQ4 cq4 = (CQ4) 1Br.A0B(c1565Alk.A0L);
        String A1A = AbF.A1A(user);
        Rl0 rl0 = c1565Alk.A03;
        if (rl0 != null) {
            String str = rl0.A02;
            if (str == null) {
                str = "";
            }
            cq4.A06(dk4, A1A, str, i, i2);
            Integer num = c1565Alk.A09;
            String str2 = "searchSurfaceType";
            if (num != null) {
                if (num == 0S2.A00 || num == 0S2.A0N || num == 0S2.A0j || num == 0S2.A0Y || num == 0S2.A0u) {
                    Rl0 rl02 = c1565Alk.A03;
                    if (rl02 != null) {
                        rl02.A03 = true;
                        A0A(c1565Alk, user);
                        return;
                    }
                } else {
                    CIq cIq = c1565Alk.A06;
                    if (cIq == null) {
                        str2 = "impressionItemAccumulator";
                    } else {
                        cIq.A03(false);
                        A08(c1565Alk);
                        Rl0 rl03 = c1565Alk.A03;
                        if (rl03 != null) {
                            if (rl03.A0B.get(A1A) == null) {
                                return;
                            }
                            Rl0 rl04 = c1565Alk.A03;
                            if (rl04 != null) {
                                Object obj = rl04.A0B.get(A1A);
                                if (obj == null) {
                                    throw 1BK.A0h();
                                }
                                Member member = ((ChannelMember) obj).A05;
                                if (member == null) {
                                    return;
                                }
                                Rl0 rl05 = c1565Alk.A03;
                                if (rl05 != null) {
                                    AfX afX = (AfX) rl05.A0D.getValue();
                                    7zP.A0O(afX.A03).A00(afX.A02, 1BK.A1G(user, member));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
        11T.A0L("viewModelController");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0A(C1565Alk c1565Alk, User user) {
        1pI r0 = c1565Alk.A01;
        String str = "contentViewManager";
        if (r0 != null) {
            if (!r0.BVa()) {
                return;
            }
            A07(c1565Alk);
            06Z A07 = AbH.A07(c1565Alk);
            Bundle A05 = 1BK.A05();
            if (user != null) {
                A05.putParcelable("realtime_selected_user", user);
                Rl0 rl0 = c1565Alk.A03;
                if (rl0 == null) {
                    str = "viewModelController";
                } else {
                    A05.putParcelable("realtime_selected_channel_member", (Parcelable) rl0.A0B.get(user.A13));
                }
            }
            A07.A1R("realtime_request_key", A05);
            1pI r02 = c1565Alk.A01;
            if (r02 != null) {
                String str2 = c1565Alk.mTag;
                if (str2 == null) {
                    throw 1BK.A0h();
                }
                r02.CeH(str2);
                return;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r0 == X.0S2.A0Y) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0B() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Integer r0 = r0.A09
            r302 = r0
            java.lang.String r0 = "searchSurfaceType"
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r303
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L14:
            java.lang.Integer r0 = X.0S2.A0j
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2b
            java.lang.Integer r0 = X.0S2.A0Y
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L2e
        L2b:
            r0 = 1
            r305 = r0
        L2e:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1565Alk.A0B():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0189, code lost:
    
        if (r305 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018c, code lost:
    
        r307 = r305.A0r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x019e, code lost:
    
        if (r305 == null) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Throwable, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1K() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1565Alk.A1K():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x021e, code lost:
    
        if (A0B() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01aa, code lost:
    
        if (r303 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1565Alk.A1S(android.os.Bundle):void");
    }

    public boolean Bkd() {
        Rl0 rl0 = this.A03;
        if (rl0 == null) {
            11T.A0L("viewModelController");
            throw 0Q8.createAndThrow();
        }
        rl0.A03 = true;
        A0A(this, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = 0FI.A02(-931646597);
        11T.A0F(layoutInflater, 0);
        super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        this.A08 = 7zV.A0S(this);
        1Br.A0C(this.A0N);
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            C0F c0f = this.A0S;
            Integer num = this.A09;
            if (num == null) {
                str = "searchSurfaceType";
            } else {
                Rl0 rl0 = new Rl0(requireContext, this, requireActivity, fbUserSession, c0f, this.A05, num);
                this.A03 = rl0;
                rl0.A03 = false;
                LithoView A0O = AbK.A0O(this);
                MigColorScheme migColorScheme = this.A08;
                if (migColorScheme != null) {
                    AbG.A1H(A0O, migColorScheme);
                    this.A0F = true;
                    A0O.A0x(A03(AbF.A0U(A0O), this, 1BK.A0b(), true, true));
                    A06(A0O, this);
                    this.A02 = A0O;
                    0FI.A08(-1054989931, A02);
                    return A0O;
                }
                str = "colorScheme";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void onSaveInstanceState(Bundle bundle) {
        String str;
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        String str2 = this.A0D;
        if (str2 == null) {
            str = "sessionId";
        } else {
            AbF.A1I(bundle, str2);
            String str3 = this.A0B;
            if (str3 == null) {
                str = "groupId";
            } else {
                bundle.putString("group_id", str3);
                ThreadKey threadKey = this.A04;
                if (threadKey == null) {
                    str = "threadKey";
                } else {
                    AbF.A1J(bundle, threadKey);
                    Integer num = this.A09;
                    if (num != null) {
                        bundle.putInt("realtime_search_surface_type", BTW.A00(num));
                        bundle.putString("query", this.A0C);
                        bundle.putParcelable("thread_summary", this.A05);
                        return;
                    }
                    str = "searchSurfaceType";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = 1vD.A00(view);
    }
}
