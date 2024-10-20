package com.meta.metaai.components.voice.animation.ui.view;

import X.0S2;
import X.11T;
import X.1BK;
import X.96E;
import X.DKG;
import X.DOw;
import X.FA9;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MetaAISpeechIndicatorView.class */
public final class MetaAISpeechIndicatorView extends DOw {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAISpeechIndicatorView(Context context) {
        super(context, (AttributeSet) null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAISpeechIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
    }

    public /* synthetic */ MetaAISpeechIndicatorView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i));
    }

    public final void A03(96E r302) {
        Integer num;
        FA9 fa9;
        switch (r302.ordinal()) {
            case 0:
                num = 0S2.A01;
                break;
            case 1:
            case 2:
                num = 0S2.A0C;
                break;
            case 3:
                num = 0S2.A0Y;
                break;
            case 4:
                num = 0S2.A0N;
                break;
            case 5:
            case 6:
                num = 0S2.A0j;
                break;
            default:
                throw 1BK.A1F();
        }
        11T.A0F(num, 0);
        if (((DOw) this).A0F != num) {
            ((DOw) this).A0F = num;
            switch (num.intValue()) {
                case 2:
                    fa9 = new FA9(1.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0013f, 0.0f, 1.0f);
                    break;
                case 3:
                    fa9 = new FA9(1.0f, 0.3f, 2.0f, 0.0f, 0.0f, 3.0f, 0.001f, 1.0f, 1.0f);
                    break;
                case 4:
                    fa9 = new FA9(1.0f, 0.0f, 4.0f, 0.3f, 1.0f, 0.0f, 0.001f, 0.0f, 1.0f);
                    break;
                default:
                    fa9 = new FA9(0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                    break;
            }
            ((DOw) this).A0E = fa9;
        }
    }
}
