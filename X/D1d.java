package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.composer.messagereply.MessageReplySummaryView;
import com.facebook.messaging.contacts.picker.common.ContactPickerListItem;
import com.facebook.messaging.groups.create.model.CreateGroupFragmentParams;
import com.facebook.messaging.montage.widget.tile.MontageTileView;
import com.mapbox.mapboxsdk.R;

/* loaded from: D1d.class */
public final class D1d implements 5W8 {
    public final int A00;
    public final Object A01;

    public D1d(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void C1Y(View view) {
        switch (this.A00) {
            case 0:
                TextView textView = (TextView) view;
                MessageReplySummaryView messageReplySummaryView = (MessageReplySummaryView) this.A01;
                CallerContext callerContext = MessageReplySummaryView.A0A;
                if (messageReplySummaryView.A05 != null) {
                    2Wo r0 = messageReplySummaryView.A08;
                    if (r0.A00 != null) {
                        AbG.A1J((TextView) r0.A01(), messageReplySummaryView.A05);
                    }
                }
                2KE r02 = 2KE.A02;
                textView.setTextSize(7zN.A00(r02));
                textView.setTypeface(2KK.A04(r02).A00(messageReplySummaryView.getContext()));
                return;
            case 1:
                ContactPickerListItem contactPickerListItem = (ContactPickerListItem) this.A01;
                MontageTileView montageTileView = (MontageTileView) C09s.A01(view, 2131365812);
                contactPickerListItem.A08 = montageTileView;
                CZD.A01(montageTileView, this, 95);
                return;
            default:
                AlM alM = (AlM) this.A01;
                Toolbar toolbar = (Toolbar) 7zL.A0F(alM, 2131364404);
                alM.A04 = toolbar;
                toolbar.setMinimumHeight(toolbar.getHeight());
                Resources resources = alM.A04.getContext().getResources();
                alM.A04.setElevation(resources.getDimension(R.dimen.mapbox_four_dp));
                1Wa r03 = (1Wa) 1Bi.A03(66347);
                CreateGroupFragmentParams createGroupFragmentParams = alM.A0D;
                if (createGroupFragmentParams.A0M) {
                    boolean A00 = r03.A00();
                    Toolbar toolbar2 = alM.A04;
                    int i = 2131960514;
                    if (A00) {
                        i = 2131960515;
                    }
                    toolbar2.A0T(resources.getString(i));
                } else {
                    Toolbar toolbar3 = alM.A04;
                    int i2 = 2131960517;
                    if (AbM.A1Y(createGroupFragmentParams)) {
                        i2 = 2131960512;
                    }
                    toolbar3.A0T(resources.getString(i2));
                    alM.A04.A0S(resources.getString(2131952364));
                }
                View.OnClickListener A002 = CZD.A00(alM, ActionId.RTMP_CONNECTION_RELEASE);
                alM.A01 = A002;
                alM.A04.A0Q(A002);
                alM.A04.A0K(2131623947);
                alM.A00 = alM.A04.A0F().findItem(2131368121);
                alM.A0H.A00(alM.getContext(), alM.A00);
                alM.A04.A0I = new CZi(alM, 0);
                SearchView searchView = (SearchView) 7zL.A0F(alM, 2131368111);
                alM.A03 = searchView;
                searchView.setQueryHint(alM.getString(2131960516));
                alM.A03.mOnQueryTextFocusChangeListener = new CZI(alM, 0);
                if (1XU.A00(alM.getContext())) {
                    alM.A03.setVisibility(0);
                    alM.A03.onActionViewExpanded();
                    alM.A00.setVisible(false);
                    alM.A03.requestFocus();
                    alM.A03.clearFocus();
                    return;
                }
                return;
        }
    }
}
