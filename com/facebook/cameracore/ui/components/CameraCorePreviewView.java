package com.facebook.cameracore.ui.components;

import X.0FI;
import X.AbF;
import X.AnonymousClass001;
import X.GOn;
import X.IJJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewParent;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

/* loaded from: CameraCorePreviewView.class */
public class CameraCorePreviewView extends SurfaceView {
    public float A00;
    public IJJ A01;
    public final List A02;

    public CameraCorePreviewView(Context context) {
        this(context, null);
    }

    public CameraCorePreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraCorePreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = -1.0f;
        this.A02 = AbF.A1F();
    }

    @Override // android.view.SurfaceView
    public SurfaceHolder getHolder() {
        IJJ ijj = this.A01;
        if (ijj == null) {
            ijj = new IJJ(super.getHolder());
            this.A01 = ijj;
        }
        return ijj;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(0, i);
        int defaultSize2 = View.getDefaultSize(0, i2);
        float f = this.A00;
        if (f != -1.0f) {
            defaultSize2 = GOn.A04(defaultSize, f);
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-808862376);
        ViewParent parent = getParent();
        boolean z = true;
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.A02.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((View.OnTouchListener) it.next()).onTouch(this, motionEvent)) {
                z2 = true;
            }
        }
        if (!z2 && !super.onTouchEvent(motionEvent)) {
            z = false;
        }
        0FI.A0B(-1432615316, A05);
        return z;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        Preconditions.checkArgument(AnonymousClass001.A1T(onTouchListener), "Use removeOnTouchListener to remove a listener");
        this.A02.add(onTouchListener);
    }
}
