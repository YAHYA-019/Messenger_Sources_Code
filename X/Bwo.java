package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.contacts.picker.SingleTapActionConfig;
import com.google.common.collect.ImmutableList;

/* loaded from: Bwo.class */
public final class Bwo {
    public final Bundle A00;
    public final View.OnClickListener A01;
    public final SingleTapActionConfig A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final boolean A06;

    public Bwo(Bundle bundle, View.OnClickListener onClickListener, SingleTapActionConfig singleTapActionConfig, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, boolean z) {
        this.A06 = z;
        this.A05 = immutableList3;
        this.A04 = immutableList2;
        this.A03 = immutableList;
        this.A00 = bundle;
        this.A02 = singleTapActionConfig;
        this.A01 = onClickListener;
    }
}
