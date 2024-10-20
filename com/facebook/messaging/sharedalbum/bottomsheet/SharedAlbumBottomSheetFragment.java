package com.facebook.messaging.sharedalbum.bottomsheet;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LH;
import X.1LI;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zQ;
import X.7zT;
import X.94U;
import X.9De;
import X.9KN;
import X.AQV;
import X.AnonymousClass001;
import X.C00g;
import X.C00i;
import X.C00m;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C37s;
import X.C8ds;
import X.C9ai;
import X.C9qq;
import X.DKB;
import X.DR7;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.viewstate.SharedAlbumsViewState;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: SharedAlbumBottomSheetFragment.class */
public final class SharedAlbumBottomSheetFragment extends MigBottomSheetDialogFragment implements C00g {
    public Parcelable A00;
    public FbUserSession A01;
    public ThreadKey A02;
    public C9ai A03;
    public SharedAlbumsViewState A04;
    public Integer A05;
    public String A07;
    public String A08;
    public String A09;
    public final 1Br A0D = 7zM.A0O();
    public final 1Br A0E = 1Bu.A00(83430);
    public final 1Br A0F = 7zN.A0I(this);
    public final 1Br A0C = 1Bu.A02(this, 67698);
    public final 1Br A0B = 1Bu.A00(147896);
    public final 1Br A0A = 1Bu.A00(68433);
    public final 1Br A0G = 1Bu.A02(this, 116004);
    public final C01i A0H = C01g.A00(C03i.A02, AQV.A00(this, 24));
    public String A06 = "";
    public final C00m A0I = AQV.A00(this, 25);
    public final 9KN A0J = new 9KN(this);
    public final 94U A0K = new 94U(this, 4);

    /* JADX WARN: Type inference failed for: r0v23, types: [X.8ds] */
    public static final C8ds A05(SharedAlbumBottomSheetFragment sharedAlbumBottomSheetFragment, final SharedAlbumsViewState sharedAlbumsViewState, final Integer num) {
        String str;
        sharedAlbumBottomSheetFragment.A1G().A0G(sharedAlbumBottomSheetFragment.A0K);
        final ThreadKey threadKey = sharedAlbumBottomSheetFragment.A02;
        final MigColorScheme A0m = 7zQ.A0m(sharedAlbumBottomSheetFragment.A0F);
        final Parcelable parcelable = sharedAlbumBottomSheetFragment.A00;
        final String str2 = sharedAlbumBottomSheetFragment.A09;
        if (str2 == null) {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        } else {
            final String str3 = sharedAlbumBottomSheetFragment.A07;
            if (str3 != null) {
                final String str4 = sharedAlbumBottomSheetFragment.A06;
                final 9KN r0 = sharedAlbumBottomSheetFragment.A0J;
                return new 1LH(parcelable, threadKey, r0, sharedAlbumsViewState, A0m, num, str2, str3, str4) { // from class: X.8ds
                    public final Parcelable A00;
                    public final ThreadKey A01;
                    public final 9KN A02;
                    public final SharedAlbumsViewState A03;
                    public final MigColorScheme A04;
                    public final Integer A05;
                    public final String A06;
                    public final String A07;
                    public final String A08;

                    {
                        11T.A0F(A0m, 2);
                        4YV.A1M(str4, 6, r0);
                        this.A01 = threadKey;
                        this.A04 = A0m;
                        this.A00 = parcelable;
                        this.A08 = str2;
                        this.A07 = str3;
                        this.A06 = str4;
                        this.A02 = r0;
                        this.A03 = sharedAlbumsViewState;
                        this.A05 = num;
                    }

                    public 1LI A0s(C2k5 c2k5) {
                        int intValue = this.A05.intValue();
                        boolean z = false;
                        if (intValue != 0) {
                            z = true;
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    return new 1LH();
                                }
                                return new 8Zi(this.A00, this.A02, this.A03, this.A04);
                            }
                        }
                        return new 8dY(this.A00, this.A01, this.A02, this.A04, this.A07, this.A06, this.A08, z);
                    }
                };
            }
            str = "creatorName";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(50);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public boolean A1J() {
        if (this.A05 != 0S2.A01) {
            return false;
        }
        9KN r0 = this.A0J;
        Integer num = 0S2.A0C;
        SharedAlbumBottomSheetFragment sharedAlbumBottomSheetFragment = r0.A00;
        sharedAlbumBottomSheetFragment.A05 = num;
        sharedAlbumBottomSheetFragment.A1L().A0y(A05(sharedAlbumBottomSheetFragment, sharedAlbumBottomSheetFragment.A04, num));
        return true;
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        return A05(this, null, 0S2.A0N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(-126156374);
        super.onCreate(bundle);
        this.A01 = 7zT.A08(this);
        Bundle requireArguments = requireArguments();
        C00i c00i = this.A0E.A00;
        String str = ((User) c00i.get()).A0X.firstName;
        if (str == null) {
            str = 7zL.A13((User) c00i.get());
            11T.A0A(str);
        }
        this.A07 = str;
        String str2 = (String) this.A0H.getValue();
        11T.A0A(str2);
        this.A06 = str2;
        this.A00 = requireArguments.getParcelable("extra_data");
        String string = requireArguments.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (string != null) {
            this.A09 = string;
            Parcelable parcelable = requireArguments.getParcelable("thread_key");
            if (parcelable != null) {
                this.A02 = (ThreadKey) parcelable;
                String string2 = requireArguments.getString("entry_point");
                if (string2 != null) {
                    this.A08 = string2;
                    1Br.A0C(this.A0B);
                    Context requireContext = requireContext();
                    ThreadKey threadKey = this.A02;
                    if (threadKey != null) {
                        C9ai c9ai = new C9ai(requireContext, threadKey);
                        this.A03 = c9ai;
                        c9ai.A01();
                        C9ai c9ai2 = this.A03;
                        if (c9ai2 == null) {
                            11T.A0L("presenter");
                            throw 0Q8.createAndThrow();
                        }
                        C9qq.A00(this, c9ai2.A00, 86);
                        0FI.A08(-1085985883, A02);
                        return;
                    }
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = 151249813;
                } else {
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = 402351508;
                }
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1262540072;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 1140524513;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(340970730);
        super.onDestroyView();
        C9ai c9ai = this.A03;
        if (c9ai == null) {
            11T.A0L("presenter");
            throw 0Q8.createAndThrow();
        }
        c9ai.A00();
        this.A04 = null;
        this.A05 = null;
        0FI.A08(1936001956, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        C9ai c9ai = this.A03;
        if (c9ai == null) {
            11T.A0L("presenter");
            throw 0Q8.createAndThrow();
        }
        c9ai.A00();
        this.A04 = null;
        this.A05 = null;
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        DR7 dr7 = ((0D2) this).A01;
        if (dr7 instanceof DR7) {
            String A00 = DKB.A00(4);
            11T.A0I(dr7, A00);
            dr7.A07 = true;
            Dialog dialog = ((0D2) this).A01;
            11T.A0I(dialog, A00);
            dialog.setCancelable(true);
        }
    }
}
