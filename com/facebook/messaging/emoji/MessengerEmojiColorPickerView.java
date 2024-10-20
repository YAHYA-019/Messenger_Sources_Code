package com.facebook.messaging.emoji;

import X.0De;
import X.1Bn;
import X.2KY;
import X.8Dk;
import X.AbG;
import X.C09s;
import X.C22a;
import X.GOp;
import X.GWh;
import X.HRI;
import X.RFM;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.widget.CustomFrameLayout;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: MessengerEmojiColorPickerView.class */
public class MessengerEmojiColorPickerView extends CustomFrameLayout {
    public int A00;
    public GWh A01;
    public RFM A02;
    public C22a A03;

    public MessengerEmojiColorPickerView(Context context) {
        super(context);
        A00();
    }

    public MessengerEmojiColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public MessengerEmojiColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        this.A01 = (GWh) 1Bn.A0A(116073);
        this.A03 = GOp.A0y();
        A0U(2132542579);
        Resources resources = getResources();
        GWh gWh = this.A01;
        int color = resources.getColor(2132214411);
        GWh.A00(gWh, color, 0De.A00(color, 0.3f));
        GWh gWh2 = this.A01;
        ImmutableList A0y = AbG.A0y(ImmutableList.builder(), this.A03.AjT(2KY.A02(this.A03, Emoji.A03(128077, 0))));
        List list = gWh2.A08;
        list.clear();
        list.addAll(A0y);
        gWh2.A07();
        this.A01.A03 = new HRI(this);
        this.A00 = resources.getDimensionPixelOffset(2132279298);
        RecyclerView recyclerView = (RecyclerView) C09s.A01(this, 2131366869);
        recyclerView.A1D(new GridLayoutManager(getContext(), false, 3, 1));
        recyclerView.A1B(new 8Dk(this, 2));
        recyclerView.A16(this.A01);
    }
}
