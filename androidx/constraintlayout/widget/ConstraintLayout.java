package androidx.constraintlayout.widget;

import X.4YW;
import X.5WL;
import X.5WM;
import X.5WN;
import X.5WT;
import X.5Wf;
import X.5Wh;
import X.5Wi;
import X.5Wj;
import X.5Wl;
import X.5XE;
import X.5XF;
import X.6Oq;
import X.C7sj;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: ConstraintLayout.class */
public class ConstraintLayout extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public SparseArray A06;
    public SparseArray A07;
    public 5WL A08;
    public 5Wf A09;
    public 6Oq A0A;
    public 5XE A0B;
    public ArrayList A0C;
    public HashMap A0D;
    public boolean A0E;

    public ConstraintLayout(Context context) {
        super(context);
        boolean A01 = 5WL.A01(this);
        4YW.A0F(this, A01 ? 1 : 0);
        this.A0B = null;
        5Wf.A00(this);
        A00(null, A01 ? 1 : 0, A01 ? 1 : 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = new SparseArray();
        this.A0C = new ArrayList(4);
        this.A08 = new 5WL();
        this.A04 = 0;
        this.A03 = 0;
        int i = (-1) >>> 1;
        this.A02 = i;
        this.A01 = i;
        this.A0E = true;
        this.A05 = 257;
        this.A0B = null;
        this.A0A = null;
        this.A00 = -1;
        this.A0D = new HashMap();
        this.A07 = new SparseArray();
        this.A09 = new 5Wf(this, this);
        A00(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean A01 = 5WL.A01(this);
        4YW.A0F(this, A01 ? 1 : 0);
        this.A0B = null;
        5Wf.A00(this);
        A00(attributeSet, i, A01 ? 1 : 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        4YW.A0F(this, 5WL.A01(this) ? 1 : 0);
        this.A0B = null;
        5Wf.A00(this);
        A00(attributeSet, i, i2);
    }

    private void A00(AttributeSet attributeSet, int i, int i2) {
        5WL r0 = this.A08;
        ((5WN) r0).A0m = this;
        5Wf r02 = this.A09;
        r0.A08 = r02;
        r0.A0A.A03 = r02;
        this.A06.put(getId(), this);
        this.A0B = null;
        if (attributeSet != null) {
            Context context = getContext();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 5Wi.A01, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= indexCount) {
                    break;
                }
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.A04 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A04);
                } else if (index == 17) {
                    this.A03 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A03);
                } else if (index == 14) {
                    this.A02 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A02);
                } else if (index == 15) {
                    this.A01 = obtainStyledAttributes.getDimensionPixelOffset(index, this.A01);
                } else if (index == 113) {
                    this.A05 = obtainStyledAttributes.getInt(index, this.A05);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.A0A = new 6Oq(context, this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.A0A = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        5XE r03 = new 5XE();
                        this.A0B = r03;
                        XmlResourceParser xml = context.getResources().getXml(resourceId2);
                        try {
                            try {
                                int eventType = xml.getEventType();
                                while (true) {
                                    int i5 = eventType;
                                    if (i5 == 1) {
                                        break;
                                    }
                                    if (i5 == 0) {
                                        xml.getName();
                                    } else if (i5 == 2) {
                                        String name = xml.getName();
                                        C7sj A01 = 5XE.A01(context, Xml.asAttributeSet(xml), false);
                                        if (name.equalsIgnoreCase("Guideline")) {
                                            A01.A03.A14 = true;
                                        }
                                        r03.A00.put(Integer.valueOf(A01.A00), A01);
                                    }
                                    eventType = xml.next();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        } catch (XmlPullParserException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Resources.NotFoundException unused2) {
                        this.A0B = null;
                    }
                    this.A00 = resourceId2;
                }
                i3 = i4 + 1;
            }
            obtainStyledAttributes.recycle();
        }
        int i6 = this.A05;
        r0.A01 = i6;
        boolean z = false;
        if ((i6 & 512) == 512) {
            z = true;
        }
        5WT.A0H = z;
    }

    private final 5WN A04(View view) {
        if (view == this) {
            return this.A08;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof 5Wh)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof 5Wh)) {
                return null;
            }
        }
        return view.getLayoutParams().A0v;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof 5Wh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.A0C;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            int i = 0;
            do {
                arrayList.get(i);
                i++;
            } while (i < size);
        }
        super.dispatchDraw(canvas);
        if (!isInEditMode()) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= childCount) {
                return;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                String[] split = ((String) tag).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                if (split.length == 4) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    int parseInt4 = Integer.parseInt(split[3]);
                    int i4 = (int) ((parseInt / 1080.0f) * width);
                    int i5 = (int) ((parseInt2 / 1920.0f) * height);
                    int i6 = (int) ((parseInt3 / 1080.0f) * width);
                    int i7 = (int) ((parseInt4 / 1920.0f) * height);
                    Paint paint = new Paint();
                    paint.setColor(-65536);
                    float f = i4;
                    float f2 = i5;
                    float f3 = i4 + i6;
                    canvas.drawLine(f, f2, f3, f2, paint);
                    float f4 = i5 + i7;
                    canvas.drawLine(f3, f2, f3, f4, paint);
                    canvas.drawLine(f3, f4, f, f4, paint);
                    canvas.drawLine(f, f4, f, f2, paint);
                    paint.setColor(-16711936);
                    canvas.drawLine(f, f2, f3, f4, paint);
                    canvas.drawLine(f, f4, f3, f2, paint);
                }
            }
            i2 = i3 + 1;
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        this.A0E = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new 5Wh(-2, -2);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        String str;
        Context context = getContext();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        ((5Wh) marginLayoutParams).A0T = -1;
        ((5Wh) marginLayoutParams).A0U = -1;
        ((5Wh) marginLayoutParams).A01 = -1.0f;
        ((5Wh) marginLayoutParams).A10 = true;
        ((5Wh) marginLayoutParams).A0W = -1;
        ((5Wh) marginLayoutParams).A0X = -1;
        ((5Wh) marginLayoutParams).A0n = -1;
        ((5Wh) marginLayoutParams).A0o = -1;
        ((5Wh) marginLayoutParams).A0s = -1;
        ((5Wh) marginLayoutParams).A0r = -1;
        ((5Wh) marginLayoutParams).A0F = -1;
        ((5Wh) marginLayoutParams).A0E = -1;
        ((5Wh) marginLayoutParams).A0B = -1;
        ((5Wh) marginLayoutParams).A0D = -1;
        ((5Wh) marginLayoutParams).A0C = -1;
        ((5Wh) marginLayoutParams).A0G = -1;
        ((5Wh) marginLayoutParams).A0H = 0;
        ((5Wh) marginLayoutParams).A00 = 0.0f;
        ((5Wh) marginLayoutParams).A0p = -1;
        ((5Wh) marginLayoutParams).A0q = -1;
        ((5Wh) marginLayoutParams).A0L = -1;
        ((5Wh) marginLayoutParams).A0K = -1;
        int i = (-1) << (-1);
        ((5Wh) marginLayoutParams).A0P = i;
        ((5Wh) marginLayoutParams).A0S = i;
        ((5Wh) marginLayoutParams).A0Q = i;
        ((5Wh) marginLayoutParams).A0N = i;
        ((5Wh) marginLayoutParams).A0R = i;
        ((5Wh) marginLayoutParams).A0O = i;
        ((5Wh) marginLayoutParams).A0M = i;
        ((5Wh) marginLayoutParams).A0A = 0;
        ((5Wh) marginLayoutParams).A02 = 0.5f;
        ((5Wh) marginLayoutParams).A08 = 0.5f;
        ((5Wh) marginLayoutParams).A0x = null;
        ((5Wh) marginLayoutParams).A03 = -1.0f;
        ((5Wh) marginLayoutParams).A09 = -1.0f;
        ((5Wh) marginLayoutParams).A0V = 0;
        ((5Wh) marginLayoutParams).A0t = 0;
        ((5Wh) marginLayoutParams).A0Z = 0;
        ((5Wh) marginLayoutParams).A0Y = 0;
        ((5Wh) marginLayoutParams).A0d = 0;
        ((5Wh) marginLayoutParams).A0c = 0;
        ((5Wh) marginLayoutParams).A0b = 0;
        ((5Wh) marginLayoutParams).A0a = 0;
        ((5Wh) marginLayoutParams).A05 = 1.0f;
        ((5Wh) marginLayoutParams).A04 = 1.0f;
        ((5Wh) marginLayoutParams).A0I = -1;
        ((5Wh) marginLayoutParams).A0J = -1;
        ((5Wh) marginLayoutParams).A0e = -1;
        ((5Wh) marginLayoutParams).A0z = false;
        ((5Wh) marginLayoutParams).A0y = false;
        ((5Wh) marginLayoutParams).A0w = null;
        ((5Wh) marginLayoutParams).A0u = 0;
        ((5Wh) marginLayoutParams).A11 = true;
        ((5Wh) marginLayoutParams).A15 = true;
        ((5Wh) marginLayoutParams).A14 = false;
        ((5Wh) marginLayoutParams).A12 = false;
        ((5Wh) marginLayoutParams).A13 = false;
        ((5Wh) marginLayoutParams).A0j = -1;
        ((5Wh) marginLayoutParams).A0k = -1;
        ((5Wh) marginLayoutParams).A0l = -1;
        ((5Wh) marginLayoutParams).A0m = -1;
        ((5Wh) marginLayoutParams).A0f = i;
        ((5Wh) marginLayoutParams).A0g = i;
        ((5Wh) marginLayoutParams).A07 = 0.5f;
        ((5Wh) marginLayoutParams).A0v = new 5WN();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 5Wi.A01);
        int indexCount = obtainStyledAttributes.getIndexCount();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= indexCount) {
                obtainStyledAttributes.recycle();
                marginLayoutParams.A00();
                return marginLayoutParams;
            }
            int index = obtainStyledAttributes.getIndex(i3);
            int i4 = 5Wj.A00.get(index);
            switch (i4) {
                case 1:
                    ((5Wh) marginLayoutParams).A0e = obtainStyledAttributes.getInt(index, ((5Wh) marginLayoutParams).A0e);
                    continue;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0G);
                    ((5Wh) marginLayoutParams).A0G = resourceId;
                    if (resourceId == -1) {
                        ((5Wh) marginLayoutParams).A0G = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    ((5Wh) marginLayoutParams).A0H = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0H);
                    continue;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, ((5Wh) marginLayoutParams).A00) % 360.0f;
                    ((5Wh) marginLayoutParams).A00 = f;
                    if (f < 0.0f) {
                        ((5Wh) marginLayoutParams).A00 = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    ((5Wh) marginLayoutParams).A0T = obtainStyledAttributes.getDimensionPixelOffset(index, ((5Wh) marginLayoutParams).A0T);
                    continue;
                case 6:
                    ((5Wh) marginLayoutParams).A0U = obtainStyledAttributes.getDimensionPixelOffset(index, ((5Wh) marginLayoutParams).A0U);
                    continue;
                case 7:
                    ((5Wh) marginLayoutParams).A01 = obtainStyledAttributes.getFloat(index, ((5Wh) marginLayoutParams).A01);
                    continue;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0W);
                    ((5Wh) marginLayoutParams).A0W = resourceId2;
                    if (resourceId2 == -1) {
                        ((5Wh) marginLayoutParams).A0W = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0X);
                    ((5Wh) marginLayoutParams).A0X = resourceId3;
                    if (resourceId3 == -1) {
                        ((5Wh) marginLayoutParams).A0X = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0n);
                    ((5Wh) marginLayoutParams).A0n = resourceId4;
                    if (resourceId4 == -1) {
                        ((5Wh) marginLayoutParams).A0n = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0o);
                    ((5Wh) marginLayoutParams).A0o = resourceId5;
                    if (resourceId5 == -1) {
                        ((5Wh) marginLayoutParams).A0o = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0s);
                    ((5Wh) marginLayoutParams).A0s = resourceId6;
                    if (resourceId6 == -1) {
                        ((5Wh) marginLayoutParams).A0s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0r);
                    ((5Wh) marginLayoutParams).A0r = resourceId7;
                    if (resourceId7 == -1) {
                        ((5Wh) marginLayoutParams).A0r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0F);
                    ((5Wh) marginLayoutParams).A0F = resourceId8;
                    if (resourceId8 == -1) {
                        ((5Wh) marginLayoutParams).A0F = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0E);
                    ((5Wh) marginLayoutParams).A0E = resourceId9;
                    if (resourceId9 == -1) {
                        ((5Wh) marginLayoutParams).A0E = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0B);
                    ((5Wh) marginLayoutParams).A0B = resourceId10;
                    if (resourceId10 == -1) {
                        ((5Wh) marginLayoutParams).A0B = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0p);
                    ((5Wh) marginLayoutParams).A0p = resourceId11;
                    if (resourceId11 == -1) {
                        ((5Wh) marginLayoutParams).A0p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0q);
                    ((5Wh) marginLayoutParams).A0q = resourceId12;
                    if (resourceId12 == -1) {
                        ((5Wh) marginLayoutParams).A0q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0L);
                    ((5Wh) marginLayoutParams).A0L = resourceId13;
                    if (resourceId13 == -1) {
                        ((5Wh) marginLayoutParams).A0L = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0K);
                    ((5Wh) marginLayoutParams).A0K = resourceId14;
                    if (resourceId14 == -1) {
                        ((5Wh) marginLayoutParams).A0K = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        continue;
                    }
                case 21:
                    ((5Wh) marginLayoutParams).A0P = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0P);
                    continue;
                case 22:
                    ((5Wh) marginLayoutParams).A0S = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0S);
                    continue;
                case 23:
                    ((5Wh) marginLayoutParams).A0Q = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0Q);
                    continue;
                case 24:
                    ((5Wh) marginLayoutParams).A0N = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0N);
                    continue;
                case 25:
                    ((5Wh) marginLayoutParams).A0R = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0R);
                    continue;
                case 26:
                    ((5Wh) marginLayoutParams).A0O = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0O);
                    continue;
                case 27:
                    ((5Wh) marginLayoutParams).A0z = obtainStyledAttributes.getBoolean(index, ((5Wh) marginLayoutParams).A0z);
                    continue;
                case 28:
                    ((5Wh) marginLayoutParams).A0y = obtainStyledAttributes.getBoolean(index, ((5Wh) marginLayoutParams).A0y);
                    continue;
                case 29:
                    ((5Wh) marginLayoutParams).A02 = obtainStyledAttributes.getFloat(index, ((5Wh) marginLayoutParams).A02);
                    continue;
                case 30:
                    ((5Wh) marginLayoutParams).A08 = obtainStyledAttributes.getFloat(index, ((5Wh) marginLayoutParams).A08);
                    continue;
                case 31:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    ((5Wh) marginLayoutParams).A0Z = i5;
                    if (i5 != 1) {
                        break;
                    } else {
                        str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        break;
                    }
                case 32:
                    int i6 = obtainStyledAttributes.getInt(index, 0);
                    ((5Wh) marginLayoutParams).A0Y = i6;
                    if (i6 != 1) {
                        break;
                    } else {
                        str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        break;
                    }
                case 33:
                    try {
                        ((5Wh) marginLayoutParams).A0d = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0d);
                        continue;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, ((5Wh) marginLayoutParams).A0d) != -2) {
                            break;
                        } else {
                            ((5Wh) marginLayoutParams).A0d = -2;
                            break;
                        }
                    }
                case 34:
                    try {
                        ((5Wh) marginLayoutParams).A0b = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0b);
                        continue;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, ((5Wh) marginLayoutParams).A0b) != -2) {
                            break;
                        } else {
                            ((5Wh) marginLayoutParams).A0b = -2;
                            break;
                        }
                    }
                case 35:
                    ((5Wh) marginLayoutParams).A05 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, ((5Wh) marginLayoutParams).A05));
                    ((5Wh) marginLayoutParams).A0Z = 2;
                    continue;
                case 36:
                    try {
                        ((5Wh) marginLayoutParams).A0c = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0c);
                        continue;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, ((5Wh) marginLayoutParams).A0c) != -2) {
                            break;
                        } else {
                            ((5Wh) marginLayoutParams).A0c = -2;
                            break;
                        }
                    }
                case 37:
                    try {
                        ((5Wh) marginLayoutParams).A0a = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0a);
                        continue;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, ((5Wh) marginLayoutParams).A0a) != -2) {
                            break;
                        } else {
                            ((5Wh) marginLayoutParams).A0a = -2;
                            break;
                        }
                    }
                case 38:
                    ((5Wh) marginLayoutParams).A04 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, ((5Wh) marginLayoutParams).A04));
                    ((5Wh) marginLayoutParams).A0Y = 2;
                    continue;
                default:
                    switch (i4) {
                        case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                            5XE.A05(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case ActionId.ON_CREATE_VIEW_END /* 45 */:
                            ((5Wh) marginLayoutParams).A03 = obtainStyledAttributes.getFloat(index, ((5Wh) marginLayoutParams).A03);
                            break;
                        case 46:
                            ((5Wh) marginLayoutParams).A09 = obtainStyledAttributes.getFloat(index, ((5Wh) marginLayoutParams).A09);
                            break;
                        case ActionId.ON_START_END /* 47 */:
                            ((5Wh) marginLayoutParams).A0V = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case ActionId.QUEUED /* 48 */:
                            ((5Wh) marginLayoutParams).A0t = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case ActionId.IN_PROGRESS /* 49 */:
                            ((5Wh) marginLayoutParams).A0I = obtainStyledAttributes.getDimensionPixelOffset(index, ((5Wh) marginLayoutParams).A0I);
                            break;
                        case 50:
                            ((5Wh) marginLayoutParams).A0J = obtainStyledAttributes.getDimensionPixelOffset(index, ((5Wh) marginLayoutParams).A0J);
                            break;
                        case ActionId.UNKNOWN /* 51 */:
                            ((5Wh) marginLayoutParams).A0w = obtainStyledAttributes.getString(index);
                            break;
                        case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0D);
                            ((5Wh) marginLayoutParams).A0D = resourceId15;
                            if (resourceId15 != -1) {
                                break;
                            } else {
                                ((5Wh) marginLayoutParams).A0D = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, ((5Wh) marginLayoutParams).A0C);
                            ((5Wh) marginLayoutParams).A0C = resourceId16;
                            if (resourceId16 != -1) {
                                break;
                            } else {
                                ((5Wh) marginLayoutParams).A0C = obtainStyledAttributes.getInt(index, -1);
                                break;
                            }
                        case ActionId.QUEUEING_BEGIN /* 54 */:
                            ((5Wh) marginLayoutParams).A0A = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0A);
                            break;
                        case ActionId.QUEUEING_SUCCESS /* 55 */:
                            ((5Wh) marginLayoutParams).A0M = obtainStyledAttributes.getDimensionPixelSize(index, ((5Wh) marginLayoutParams).A0M);
                            break;
                        default:
                            switch (i4) {
                                case 64:
                                    5XE.A04(obtainStyledAttributes, marginLayoutParams, index, 0);
                                    break;
                                case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                                    5XE.A04(obtainStyledAttributes, marginLayoutParams, index, 1);
                                    break;
                                case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                                    ((5Wh) marginLayoutParams).A0u = obtainStyledAttributes.getInt(index, ((5Wh) marginLayoutParams).A0u);
                                    break;
                                case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                                    ((5Wh) marginLayoutParams).A10 = obtainStyledAttributes.getBoolean(index, ((5Wh) marginLayoutParams).A10);
                                    break;
                                default:
                                    continue;
                            }
                    }
            }
            Log.e("ConstraintLayout", str);
            i2 = i3 + 1;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        ((5Wh) marginLayoutParams).A0T = -1;
        ((5Wh) marginLayoutParams).A0U = -1;
        ((5Wh) marginLayoutParams).A01 = -1.0f;
        ((5Wh) marginLayoutParams).A10 = true;
        ((5Wh) marginLayoutParams).A0W = -1;
        ((5Wh) marginLayoutParams).A0X = -1;
        ((5Wh) marginLayoutParams).A0n = -1;
        ((5Wh) marginLayoutParams).A0o = -1;
        ((5Wh) marginLayoutParams).A0s = -1;
        ((5Wh) marginLayoutParams).A0r = -1;
        ((5Wh) marginLayoutParams).A0F = -1;
        ((5Wh) marginLayoutParams).A0E = -1;
        ((5Wh) marginLayoutParams).A0B = -1;
        ((5Wh) marginLayoutParams).A0D = -1;
        ((5Wh) marginLayoutParams).A0C = -1;
        ((5Wh) marginLayoutParams).A0G = -1;
        ((5Wh) marginLayoutParams).A0H = 0;
        ((5Wh) marginLayoutParams).A00 = 0.0f;
        ((5Wh) marginLayoutParams).A0p = -1;
        ((5Wh) marginLayoutParams).A0q = -1;
        ((5Wh) marginLayoutParams).A0L = -1;
        ((5Wh) marginLayoutParams).A0K = -1;
        int i = (-1) << (-1);
        ((5Wh) marginLayoutParams).A0P = i;
        ((5Wh) marginLayoutParams).A0S = i;
        ((5Wh) marginLayoutParams).A0Q = i;
        ((5Wh) marginLayoutParams).A0N = i;
        ((5Wh) marginLayoutParams).A0R = i;
        ((5Wh) marginLayoutParams).A0O = i;
        ((5Wh) marginLayoutParams).A0M = i;
        ((5Wh) marginLayoutParams).A0A = 0;
        ((5Wh) marginLayoutParams).A02 = 0.5f;
        ((5Wh) marginLayoutParams).A08 = 0.5f;
        ((5Wh) marginLayoutParams).A0x = null;
        ((5Wh) marginLayoutParams).A03 = -1.0f;
        ((5Wh) marginLayoutParams).A09 = -1.0f;
        ((5Wh) marginLayoutParams).A0V = 0;
        ((5Wh) marginLayoutParams).A0t = 0;
        ((5Wh) marginLayoutParams).A0Z = 0;
        ((5Wh) marginLayoutParams).A0Y = 0;
        ((5Wh) marginLayoutParams).A0d = 0;
        ((5Wh) marginLayoutParams).A0c = 0;
        ((5Wh) marginLayoutParams).A0b = 0;
        ((5Wh) marginLayoutParams).A0a = 0;
        ((5Wh) marginLayoutParams).A05 = 1.0f;
        ((5Wh) marginLayoutParams).A04 = 1.0f;
        ((5Wh) marginLayoutParams).A0I = -1;
        ((5Wh) marginLayoutParams).A0J = -1;
        ((5Wh) marginLayoutParams).A0e = -1;
        ((5Wh) marginLayoutParams).A0z = false;
        ((5Wh) marginLayoutParams).A0y = false;
        ((5Wh) marginLayoutParams).A0w = null;
        ((5Wh) marginLayoutParams).A0u = 0;
        ((5Wh) marginLayoutParams).A11 = true;
        ((5Wh) marginLayoutParams).A15 = true;
        ((5Wh) marginLayoutParams).A14 = false;
        ((5Wh) marginLayoutParams).A12 = false;
        ((5Wh) marginLayoutParams).A13 = false;
        ((5Wh) marginLayoutParams).A0j = -1;
        ((5Wh) marginLayoutParams).A0k = -1;
        ((5Wh) marginLayoutParams).A0l = -1;
        ((5Wh) marginLayoutParams).A0m = -1;
        ((5Wh) marginLayoutParams).A0f = i;
        ((5Wh) marginLayoutParams).A0g = i;
        ((5Wh) marginLayoutParams).A07 = 0.5f;
        ((5Wh) marginLayoutParams).A0v = new 5WN();
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            5Wh layoutParams = childAt.getLayoutParams();
            5WN r0 = layoutParams.A0v;
            if (childAt.getVisibility() != 8 || layoutParams.A12 || layoutParams.A13 || isInEditMode) {
                int A07 = r0.A07();
                int A08 = r0.A08();
                childAt.layout(A07, A08, r0.A06() + A07, r0.A05() + A08);
            }
            i6 = i7 + 1;
        }
        ArrayList arrayList = this.A0C;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        do {
            View view = (5Wl) arrayList.get(i5);
            if (view instanceof Group) {
                5WN r02 = view.getLayoutParams().A0v;
                r02.A0E(0);
                r02.A0D(0);
            }
            i5++;
        } while (i5 < size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02d1, code lost:
    
        if (r0 <= 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02d4, code lost:
    
        r305 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02e1, code lost:
    
        if (r305 >= r0) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02e4, code lost:
    
        getChildAt(r305);
        r305 = r305 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x045e, code lost:
    
        r0 = r301.A07;
        r0.clear();
        r0.put(0, r0);
        r0.put(getId(), r0);
        r332 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x048d, code lost:
    
        if (r332 >= r0) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0490, code lost:
    
        r0 = getChildAt(r332);
        r0.put(r0.getId(), A04(r0));
        r332 = r332 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04b9, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04bc, code lost:
    
        r337 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04c4, code lost:
    
        if (r337 >= r0) goto L747;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x04c7, code lost:
    
        r0 = getChildAt(r337);
        r0 = A04(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04d9, code lost:
    
        if (r0 == null) goto L749;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04dc, code lost:
    
        r0 = (X.5Wh) r0.getLayoutParams();
        ((X.5WM) r0).A00.add(r0);
        r0 = ((X.5WN) r0).A0h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04fa, code lost:
    
        if (r0 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04fd, code lost:
    
        r0.A00.remove(r0);
        r0.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0514, code lost:
    
        ((X.5WN) r0).A0h = r0;
        r0.A00();
        ((X.5WN) r0).A0R = r0.getVisibility();
        ((X.5WN) r0).A0m = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x053e, code lost:
    
        if ((r0 instanceof X.5Wl) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0541, code lost:
    
        r0 = r0;
        r0 = ((X.5WL) r0).A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0558, code lost:
    
        if ((r0 instanceof androidx.constraintlayout.widget.Barrier) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x055b, code lost:
    
        r330 = ((androidx.constraintlayout.widget.Barrier) r0).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x057c, code lost:
    
        if (r0 == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0583, code lost:
    
        if (r330 == 5) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x058a, code lost:
    
        if (r330 != 6) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x058d, code lost:
    
        r330 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x059f, code lost:
    
        if ((r0 instanceof X.5XG) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x05a2, code lost:
    
        r0.A00 = r330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0fb9, code lost:
    
        r330 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0faf, code lost:
    
        if (r330 == 5) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0fb6, code lost:
    
        if (r330 != 6) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x05bd, code lost:
    
        if (r0.A12 == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x05c0, code lost:
    
        r0 = (X.5XF) r0;
        r0 = r0.A0h;
        r0 = r0.A0i;
        r0 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x05ef, code lost:
    
        if (r0 == (-1.0f)) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x05fb, code lost:
    
        if (r0 <= (-1.0f)) goto L750;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x05fe, code lost:
    
        r0.A00 = r0;
        r0.A02 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x060c, code lost:
    
        r0.A03 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0620, code lost:
    
        if (r0 == (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0627, code lost:
    
        if (r0 <= (-1)) goto L751;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x062a, code lost:
    
        r0.A00 = -1.0f;
        r0.A02 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x063f, code lost:
    
        if (r0 == (-1)) goto L752;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0646, code lost:
    
        if (r0 <= (-1)) goto L753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0649, code lost:
    
        r0.A00 = -1.0f;
        r0.A02 = -1;
        r0.A03 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0661, code lost:
    
        r0 = r0.A0j;
        r0 = r0.A0k;
        r0 = r0.A0l;
        r0 = r0.A0m;
        r0 = r0.A0f;
        r0 = r0.A0g;
        r0 = r0.A07;
        r0 = r0.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x06a1, code lost:
    
        if (r0 == (-1)) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x06a4, code lost:
    
        r0 = (X.5WN) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x06b2, code lost:
    
        if (r0 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x06b5, code lost:
    
        r0 = r0.A00;
        r0 = r0.A0H;
        r0 = X.0S2.A0u;
        ((X.5WN) r0).A0L(r0, r0, r0, r0, 0);
        ((X.5WN) r0).A00 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x06fb, code lost:
    
        if (r0 == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x06fe, code lost:
    
        r0 = r0.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0709, code lost:
    
        if (r0 != (-1)) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0717, code lost:
    
        if (r0.A0J == (-1)) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x071a, code lost:
    
        r0 = r0.A0J;
        ((X.5WN) r0).A0V = r0;
        ((X.5WN) r0).A0W = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0735, code lost:
    
        r0 = r0.A11;
        r0 = 0.0f / 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0747, code lost:
    
        if (r0 != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0755, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r0).width != (-1)) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0761, code lost:
    
        if (r0.A0z == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0764, code lost:
    
        r323 = X.0S2.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0769, code lost:
    
        ((X.5WN) r0).A11[0] = r323;
        ((X.5WN) r0).A09(X.0S2.A01).A02 = ((android.view.ViewGroup.MarginLayoutParams) r0).leftMargin;
        ((X.5WN) r0).A09(X.0S2.A0N).A02 = ((android.view.ViewGroup.MarginLayoutParams) r0).rightMargin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x07bc, code lost:
    
        if (r0.A15 != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x07ca, code lost:
    
        if (((android.view.ViewGroup.LayoutParams) r0).height != (-1)) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x07d6, code lost:
    
        if (r0.A0y == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x07d9, code lost:
    
        r323 = X.0S2.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x07de, code lost:
    
        ((X.5WN) r0).A11[1] = r323;
        ((X.5WN) r0).A09(X.0S2.A0C).A02 = ((android.view.ViewGroup.MarginLayoutParams) r0).topMargin;
        ((X.5WN) r0).A09(X.0S2.A0Y).A02 = ((android.view.ViewGroup.MarginLayoutParams) r0).bottomMargin;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0829, code lost:
    
        r0 = r0.A0x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0838, code lost:
    
        if (r0 == null) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x083b, code lost:
    
        r0 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0844, code lost:
    
        if (r0 == 0) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0847, code lost:
    
        r329 = -1;
        r0 = r0.indexOf(44);
        r321 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0867, code lost:
    
        if (r0 <= 0) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0874, code lost:
    
        if (r0 >= (r0 - 1)) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0877, code lost:
    
        r0 = r0.substring(0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0891, code lost:
    
        if (r0.equalsIgnoreCase("W") == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0894, code lost:
    
        r329 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x089a, code lost:
    
        r321 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0900, code lost:
    
        if (r0.equalsIgnoreCase("H") == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0903, code lost:
    
        r329 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x08a0, code lost:
    
        r0 = r0.indexOf(58);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x08b0, code lost:
    
        if (r0 < 0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x08be, code lost:
    
        if (r0 >= (r0 - 1)) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x08c1, code lost:
    
        r0 = r0.substring(r321, r0);
        r0 = X.AnonymousClass001.A0W(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x08de, code lost:
    
        if (r0.length() <= 0) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x08ea, code lost:
    
        if (r0.length() <= 0) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0d94, code lost:
    
        r0 = java.lang.Float.parseFloat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0d9b, code lost:
    
        r0 = java.lang.Float.parseFloat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0daa, code lost:
    
        if (r0 <= 0.0f) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0db5, code lost:
    
        if (r0 <= 0.0f) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0dbc, code lost:
    
        if (r329 != 1) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0dc6, code lost:
    
        r322 = java.lang.Math.abs(r0 / r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0e14, code lost:
    
        if (r322 <= 0.0f) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0e17, code lost:
    
        ((X.5WN) r0).A01 = r322;
        ((X.5WN) r0).A09 = r329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0dd7, code lost:
    
        r322 = java.lang.Math.abs(r0 / r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0de1, code lost:
    
        r0 = r0.substring(r321);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0df3, code lost:
    
        if (r0.length() <= 0) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0df6, code lost:
    
        r322 = java.lang.Float.parseFloat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0e00, code lost:
    
        ((X.5WN) r0).A01 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0909, code lost:
    
        r323 = X.0S2.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0911, code lost:
    
        ((X.5WN) r0).A11[1] = X.0S2.A0C;
        ((X.5WN) r0).A0D(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0933, code lost:
    
        ((X.5WN) r0).A11[1] = X.0S2.A00;
        r0 = ((android.view.ViewGroup.LayoutParams) r0).height;
        ((X.5WN) r0).A0D(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x095e, code lost:
    
        if (r0 != (-2)) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0961, code lost:
    
        ((X.5WN) r0).A11[1] = X.0S2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x097a, code lost:
    
        r323 = X.0S2.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0982, code lost:
    
        ((X.5WN) r0).A11[0] = X.0S2.A0C;
        ((X.5WN) r0).A0E(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x09a3, code lost:
    
        ((X.5WN) r0).A11[0] = X.0S2.A00;
        r0 = ((android.view.ViewGroup.LayoutParams) r0).width;
        ((X.5WN) r0).A0E(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x09cd, code lost:
    
        if (r0 != (-2)) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x09d0, code lost:
    
        ((X.5WN) r0).A11[0] = X.0S2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x09ec, code lost:
    
        if (r0 == (-1)) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x09ef, code lost:
    
        r0 = (X.5WN) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x09fd, code lost:
    
        if (r0 == null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0a00, code lost:
    
        r341 = X.0S2.A01;
        r329 = ((android.view.ViewGroup.MarginLayoutParams) r0).leftMargin;
        r342 = r0;
        r343 = r0;
        r344 = r341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0a18, code lost:
    
        ((X.5WN) r342).A0L(r343, r341, r344, r329, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0a32, code lost:
    
        if (r0 == (-1)) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0a35, code lost:
    
        r0 = (X.5WN) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0a43, code lost:
    
        if (r0 == null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0a46, code lost:
    
        r341 = X.0S2.A0N;
        r344 = X.0S2.A01;
        r321 = ((android.view.ViewGroup.MarginLayoutParams) r0).rightMargin;
        r342 = r0;
        r343 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0a5f, code lost:
    
        ((X.5WN) r342).A0L(r343, r341, r344, r321, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0a79, code lost:
    
        r0 = r0.A0s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0a84, code lost:
    
        if (r0 == (-1)) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0a87, code lost:
    
        r0 = (X.5WN) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0a95, code lost:
    
        if (r0 == null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0a98, code lost:
    
        r341 = X.0S2.A0C;
        r330 = ((android.view.ViewGroup.MarginLayoutParams) r0).topMargin;
        r321 = r0.A0S;
        r342 = r0;
        r343 = r0;
        r344 = r341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0ab7, code lost:
    
        ((X.5WN) r342).A0L(r343, r341, r344, r330, r321);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0ad1, code lost:
    
        r0 = r0.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0adc, code lost:
    
        if (r0 == (-1)) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0adf, code lost:
    
        r0 = (X.5WN) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0aed, code lost:
    
        if (r0 == null) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0af0, code lost:
    
        r341 = X.0S2.A0Y;
        r344 = X.0S2.A0C;
        r330 = ((android.view.ViewGroup.MarginLayoutParams) r0).bottomMargin;
        r321 = r0.A0N;
        r342 = r0;
        r343 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0b10, code lost:
    
        ((X.5WN) r342).A0L(r343, r341, r344, r330, r321);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0b2a, code lost:
    
        r330 = r0.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0b35, code lost:
    
        if (r330 == (-1)) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0b38, code lost:
    
        r328 = X.0S2.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0b3d, code lost:
    
        r0 = (android.view.View) r301.A06.get(r330);
        r0 = (X.5WN) r0.get(r330);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0b5d, code lost:
    
        if (r0 == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0b62, code lost:
    
        if (r0 == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0b75, code lost:
    
        if ((r0.getLayoutParams() instanceof X.5Wh) == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0b78, code lost:
    
        r0.A14 = true;
        r0 = X.0S2.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0b88, code lost:
    
        if (r328 != r0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0b8b, code lost:
    
        r0 = r0.getLayoutParams();
        r0.A14 = true;
        r0.A0v.A0p = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0baa, code lost:
    
        r0 = ((X.5WN) r0).A09(r0);
        r0 = r0.A09(r328);
        r0 = r0.A0A;
        r0 = r0.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0bcf, code lost:
    
        if (r0 != null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0bd2, code lost:
    
        r0.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0bd7, code lost:
    
        ((X.5WN) r0).A0p = true;
        ((X.5WN) r0).A09(X.0S2.A0C).A03();
        ((X.5WN) r0).A09(X.0S2.A0Y).A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0c46, code lost:
    
        r0.A04 = r0;
        r323 = r0.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0c56, code lost:
    
        if (r323 != null) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0c59, code lost:
    
        r323 = X.AnonymousClass001.A0v();
        r0.A05 = r323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0c65, code lost:
    
        r323.add(r0);
        r0.A02 = r0;
        r0.A01 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0c1a, code lost:
    
        if (r0 < 0.0f) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0c1d, code lost:
    
        ((X.5WN) r0).A02 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0c27, code lost:
    
        r0 = r0.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0c36, code lost:
    
        if (r0 < 0.0f) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0c39, code lost:
    
        ((X.5WN) r0).A06 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0c7e, code lost:
    
        r330 = r0.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0c89, code lost:
    
        if (r330 == (-1)) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0c8c, code lost:
    
        r328 = X.0S2.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0c94, code lost:
    
        r330 = r0.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0c9f, code lost:
    
        if (r330 == (-1)) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0ca2, code lost:
    
        r328 = X.0S2.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0caa, code lost:
    
        r0 = r0.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0cb5, code lost:
    
        if (r0 == (-1)) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0cb8, code lost:
    
        r0 = (X.5WN) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0cc6, code lost:
    
        if (r0 == null) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0cc9, code lost:
    
        r341 = X.0S2.A0Y;
        r330 = ((android.view.ViewGroup.MarginLayoutParams) r0).bottomMargin;
        r321 = r0.A0N;
        r342 = r0;
        r343 = r0;
        r344 = r341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0ceb, code lost:
    
        r0 = r0.A0r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0cf6, code lost:
    
        if (r0 == (-1)) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0cf9, code lost:
    
        r0 = (X.5WN) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0d07, code lost:
    
        if (r0 == null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0d0a, code lost:
    
        r341 = X.0S2.A0C;
        r344 = X.0S2.A0Y;
        r330 = ((android.view.ViewGroup.MarginLayoutParams) r0).topMargin;
        r321 = r0.A0S;
        r342 = r0;
        r343 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0d31, code lost:
    
        if (r0 == (-1)) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0d34, code lost:
    
        r0 = (X.5WN) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0d42, code lost:
    
        if (r0 == null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0d45, code lost:
    
        r341 = X.0S2.A0N;
        r321 = ((android.view.ViewGroup.MarginLayoutParams) r0).rightMargin;
        r342 = r0;
        r343 = r0;
        r344 = r341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0d64, code lost:
    
        if (r0 == (-1)) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0d67, code lost:
    
        r0 = (X.5WN) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0d75, code lost:
    
        if (r0 == null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0d78, code lost:
    
        r341 = X.0S2.A01;
        r344 = X.0S2.A0N;
        r329 = ((android.view.ViewGroup.MarginLayoutParams) r0).leftMargin;
        r342 = r0;
        r343 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0fc3, code lost:
    
        ((X.5WL) r0).A09.A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x02f4, code lost:
    
        r0 = (X.5Wl) r0.get(r330);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0309, code lost:
    
        if (r0.isInEditMode() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x030c, code lost:
    
        X.5Wl.A02(r0, r0.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x031a, code lost:
    
        r0 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0323, code lost:
    
        if (r0 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0326, code lost:
    
        r0 = r0;
        r0.A00 = 0;
        java.util.Arrays.fill(r0.A01, (java.lang.Object) null);
        r332 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x035d, code lost:
    
        if (r332 >= r0.A00) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0360, code lost:
    
        r0 = r0.A05[r332];
        r0 = r301.A06;
        r311 = (android.view.View) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x037e, code lost:
    
        if (r311 != null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0381, code lost:
    
        r0 = r0.A04;
        r0 = X.4YU.A16(java.lang.Integer.valueOf(r0), r0);
        r0 = X.5Wl.A00(r0, r301, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x03a4, code lost:
    
        if (r0 == 0) goto L763;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x03a7, code lost:
    
        r0.A05[r332] = r0;
        r0.put(java.lang.Integer.valueOf(r0), r0);
        r311 = (android.view.View) r0.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x03d0, code lost:
    
        if (r311 == null) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0445, code lost:
    
        r332 = r332 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x03d3, code lost:
    
        r0 = r0.A02;
        r0 = A04(r311);
        r0 = (X.5XH) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x03ed, code lost:
    
        if (r0 == r0) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x03f2, code lost:
    
        if (r0 == null) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x03f5, code lost:
    
        r0 = ((X.5XH) r0).A00 + 1;
        r310 = ((X.5XH) r0).A01;
        r0 = r310.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x040e, code lost:
    
        if (r0 <= r0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0411, code lost:
    
        r310 = (X.5WN[]) java.util.Arrays.copyOf(r310, r0 * 2);
        ((X.5XH) r0).A01 = r310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x042a, code lost:
    
        r0 = ((X.5XH) r0).A00;
        r310[r0] = r0;
        ((X.5XH) r0).A00 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x044e, code lost:
    
        r330 = r330 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0458, code lost:
    
        if (r330 >= r0) goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x117c, code lost:
    
        if (r330 != r0.A05()) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x19b0, code lost:
    
        if (r314 != 2) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x1b34, code lost:
    
        if (r0 != r0) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x1b04, code lost:
    
        if (r0 == r0) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x1bc8, code lost:
    
        if (r0 > 0) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x1bcb, code lost:
    
        r0.get(r314);
        r314 = r314 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x1bdd, code lost:
    
        if (r314 >= r0) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x1f63, code lost:
    
        if (r0 == r0.A08) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x1355, code lost:
    
        if (r318 == false) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x1317, code lost:
    
        if (r0.A01 <= 0.0f) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x149e, code lost:
    
        if (r0 == 0) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x14ba, code lost:
    
        r330 = java.lang.Math.max(0, r301.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x14b7, code lost:
    
        if (r0 == 0) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x14d2, code lost:
    
        if (r0 == 0) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x14eb, code lost:
    
        r336 = java.lang.Math.max(0, r301.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x14e8, code lost:
    
        if (r0 == 0) goto L486;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:644:0x1a72 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x1a72 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1856, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v1866, types: [android.view.View] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 8273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        5WN A04 = A04(view);
        if ((view instanceof Guideline) && !(A04 instanceof 5XF)) {
            5Wh layoutParams = view.getLayoutParams();
            5XF r0 = new 5XF();
            layoutParams.A0v = r0;
            layoutParams.A12 = true;
            r0.A0V(layoutParams.A0e);
        }
        if (view instanceof 5Wl) {
            5Wl r02 = (5Wl) view;
            r02.A06();
            view.getLayoutParams().A13 = true;
            ArrayList arrayList = this.A0C;
            if (!arrayList.contains(r02)) {
                arrayList.add(r02);
            }
        }
        this.A06.put(view.getId(), view);
        this.A0E = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A06.remove(view.getId());
        5WN A04 = A04(view);
        ((5WM) this.A08).A00.remove(A04);
        A04.A0B();
        this.A0C.remove(view);
        this.A0E = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.A0E = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void setId(int i) {
        SparseArray sparseArray = this.A06;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
