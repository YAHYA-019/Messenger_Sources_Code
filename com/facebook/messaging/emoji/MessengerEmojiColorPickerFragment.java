package com.facebook.messaging.emoji;

import X.0FI;
import X.1BL;
import X.1iF;
import X.2KY;
import X.7zL;
import X.7zN;
import X.AbF;
import X.AbG;
import X.C22a;
import X.C3R7;
import X.GOp;
import X.GWh;
import X.RFM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment;
import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.Emoji;

/* loaded from: MessengerEmojiColorPickerFragment.class */
public class MessengerEmojiColorPickerFragment extends SlidingSheetDialogFragment {
    public C3R7 A00;
    public C22a A01;
    public MessengerEmojiColorPickerView A02;

    public 1iF A17() {
        return AbF.A0C(442780740380519L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.widget.dialog.SlidingSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-928500292);
        super.onCreate(bundle);
        this.A00 = (C3R7) 7zN.A0m(this, 1BL.A0G(this), 67391);
        this.A01 = GOp.A0y();
        0FI.A08(-1264053133, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1436790403);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542578);
        0FI.A08(-1994349699, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        MessengerEmojiColorPickerView messengerEmojiColorPickerView = (MessengerEmojiColorPickerView) 7zL.A0F(this, 2131363855);
        this.A02 = messengerEmojiColorPickerView;
        C3R7 c3r7 = this.A00;
        c3r7.getClass();
        int A01 = c3r7.A01();
        BasicEmoji basicEmoji = null;
        if (A01 != -1) {
            basicEmoji = 2KY.A02(messengerEmojiColorPickerView.A03, Emoji.A03(128077, A01));
        }
        GWh gWh = messengerEmojiColorPickerView.A01;
        gWh.A04 = basicEmoji;
        gWh.A07();
        this.A02.A02 = new RFM(this);
    }
}
