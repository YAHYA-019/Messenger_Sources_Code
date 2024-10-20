package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.UserKey;
import com.facebook.user.tiles.UserTileView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Date;
import java.util.concurrent.Executor;

/* renamed from: X.Gbi, reason: case insensitive filesystem */
/* loaded from: Gbi.class */
public final class C2381Gbi extends 1pK {
    public static final String __redex_internal_original_name = "MediaViewInfoFragment";
    public TextView A00;
    public HSO A01;
    public MediaMessageItem A02;
    public C2ff A03;
    public 2oN A04;
    public final C00i A05 = AbH.A0c(this);
    public final C00i A06 = AbH.A0Q();
    public final C00i A07 = 1BV.A00(147634);

    public 1iF A1R() {
        return AbF.A0C(308851093610228L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        FbUserSession A0G = 1BL.A0G(this);
        this.A04 = (2oN) 7zO.A0m(this, 33246);
        this.A03 = (C2ff) 7zN.A0m(this, A0G, 17069);
        this.A02 = (MediaMessageItem) AbG.A07(requireArguments(), "media_item");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-434872090);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542520);
        0FI.A08(-631033029, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FbUserSession A0G = 1BL.A0G(this);
        C00i c00i = this.A05;
        MigColorScheme.A00(view, AbF.A0p(c00i));
        Toolbar toolbar = (Toolbar) 7zL.A0F(this, 2131365553);
        C00i c00i2 = this.A06;
        toolbar.A0P(7zO.A0F(C1u3.A0U, GOn.A0M(c00i2), AbF.A0p(c00i)));
        toolbar.A0Q(new IJd(this));
        MigColorScheme.A00(toolbar, AbF.A0p(c00i));
        toolbar.A0M(2131959266);
        toolbar.A0N(AbF.A0p(c00i).B4i());
        this.A07.get();
        requireContext();
        TextView A0D = DKG.A0D(this, 2131365552);
        AbG.A1J(A0D, AbF.A0p(c00i));
        View A0F = 7zL.A0F(this, 2131365500);
        UserKey BAN = this.A02.BAN();
        if (BAN == null) {
            A0D.setVisibility(8);
            A0F.setVisibility(8);
        } else {
            UserTileView userTileView = (UserTileView) C09s.A01(((ViewStub) C09s.A01(A0F, 2131365503)).inflate(), 2131365502);
            C2ff c2ff = this.A03;
            c2ff.getClass();
            userTileView.A03(c2ff.A02(BAN, "", 0));
            ((2qN) 4YU.A0p(userTileView.A00)).A09(GOo.A00(7zO.A0D(this)));
            TextView A0D2 = DKG.A0D(this, 2131365501);
            DKH.A1B(A0D2, c00i);
            A0D2.setText(this.A02.BAM());
            MediaMessageItem mediaMessageItem = this.A02;
            if (mediaMessageItem.BAM().isEmpty() && mediaMessageItem.Awv() != null) {
                7V5 r0 = (7V5) GOo.A0o(A0D2, A0G, 67951);
                Executor executor = (Executor) 1Bi.A03(16467);
                String Awv = this.A02.Awv();
                11T.A0F(Awv, 0);
                ?? A0j = 4YU.A0j();
                MailboxFeature A0d = 7zP.A0d(r0.A01);
                Iby iby = new Iby((SettableFuture) A0j, 8);
                1Um A0O = 1BK.A0O(A0d, 0);
                MailboxFutureImpl A0Q = 1BK.A0Q(A0O, iby);
                1Um.A02(A0O, new Iar(A0d, A0Q, Awv, 0), A0Q, false);
                1Kd.A0F(new Inh(2, A0D2, userTileView, this), (ListenableFuture) A0j, executor);
            }
            TextView A0D3 = DKG.A0D(this, 2131365499);
            DKH.A1B(A0D3, c00i);
            2oN r02 = this.A04;
            r02.getClass();
            long j = this.A02.AwL().A06;
            int A00 = 2oN.A00(r02, j);
            Date date = new Date(j);
            C2sT c2sT = (C2sT) 1Br.A0B(r02.A01);
            A0D3.setText(0Pz.A0Y((A00 < 180 ? c2sT.A05() : c2sT.A06()).format(date), DateFormat.getTimeFormat(r02.A00).format(date), ' '));
        }
        AbG.A1J(DKG.A0D(this, 2131365495), AbF.A0p(c00i));
        GOo.A1E((ImageView) 7zL.A0F(this, 2131365498), C1u3.A4t, GOn.A0M(c00i2), AbF.A0p(c00i).B4h());
        TextView A0D4 = DKG.A0D(this, 2131365497);
        this.A00 = A0D4;
        DKH.A1B(A0D4, c00i);
        this.A00.setText(this.A02.AqA().getLastPathSegment());
        TextView A0D5 = DKG.A0D(this, 2131365496);
        DKH.A1B(A0D5, c00i);
        Resources A0D6 = 7zO.A0D(this);
        MediaMessageItem mediaMessageItem2 = this.A02;
        A0D5.setText(A0D6.getString(2131959344, AnonymousClass001.A1b(Integer.valueOf(mediaMessageItem2.B0a()), mediaMessageItem2.B0d())));
    }
}
