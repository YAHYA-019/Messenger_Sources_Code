package com.airbnb.lottie;

import X.0Em;
import X.0FI;
import X.0Pz;
import X.0S2;
import X.7zK;
import X.7zL;
import X.AnonymousClass001;
import X.C3125Jjw;
import X.C3129Jk0;
import X.GOp;
import X.J4z;
import X.J58;
import X.JQy;
import X.JUO;
import X.JVZ;
import X.KN3;
import X.Ka6;
import X.Kkp;
import X.L2w;
import X.L34;
import X.L4k;
import X.L8z;
import X.LCD;
import X.LDc;
import X.LGo;
import X.LS1;
import X.LS2;
import X.LS3;
import X.Lk8;
import X.Ltd;
import X.Ltj;
import X.MEg;
import X.MEh;
import X.MEm;
import X.MLa;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: LottieAnimationView.class */
public class LottieAnimationView extends AppCompatImageView {
    public static final MEh A0D = new LS1();
    public int A00;
    public MEh A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public LCD A05;
    public String A06;
    public boolean A07;
    public final JVZ A08;
    public final Set A09;
    public final MEh A0A;
    public final MEh A0B;
    public final Set A0C;

    /* loaded from: LottieAnimationView$SavedState.class */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LGo.A00(45);
        public float A00;
        public int A01;
        public int A02;
        public int A03;
        public String A04;
        public String A05;
        public boolean A06;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.A04);
            parcel.writeFloat(this.A00);
            parcel.writeInt(this.A06 ? 1 : 0);
            parcel.writeString(this.A05);
            parcel.writeInt(this.A03);
            parcel.writeInt(this.A02);
        }
    }

    public LottieAnimationView(Context context) {
        super(context, null);
        this.A0A = new LS3(this);
        this.A0B = new LS2(this);
        this.A00 = 0;
        this.A08 = new JVZ();
        this.A07 = false;
        this.A02 = false;
        this.A03 = true;
        this.A09 = AnonymousClass001.A0v();
        this.A0C = AnonymousClass001.A0v();
        A01(null, 2130970955);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = new LS3(this);
        this.A0B = new LS2(this);
        this.A00 = 0;
        this.A08 = new JVZ();
        this.A07 = false;
        this.A02 = false;
        this.A03 = true;
        this.A09 = AnonymousClass001.A0v();
        this.A0C = AnonymousClass001.A0v();
        A01(attributeSet, 2130970955);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0A = new LS3(this);
        this.A0B = new LS2(this);
        this.A00 = 0;
        this.A08 = new JVZ();
        this.A07 = false;
        this.A02 = false;
        this.A03 = true;
        this.A09 = AnonymousClass001.A0v();
        this.A0C = AnonymousClass001.A0v();
        A01(attributeSet, i);
    }

    private void A00() {
        LCD lcd = this.A05;
        if (lcd != null) {
            MEh mEh = this.A0A;
            synchronized (lcd) {
                try {
                    lcd.A02.remove(mEh);
                } catch (Throwable th) {
                    throw th;
                }
            }
            lcd = this.A05;
            MEh mEh2 = this.A0B;
            synchronized (lcd) {
                lcd.A01.remove(mEh2);
            }
        }
    }

    private void A01(AttributeSet attributeSet, int i) {
        String string;
        Context context = getContext();
        boolean z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Ka6.A00, i, 0);
        this.A03 = obtainStyledAttributes.getBoolean(2, true);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        boolean hasValue2 = obtainStyledAttributes.hasValue(9);
        boolean hasValue3 = obtainStyledAttributes.hasValue(19);
        if (hasValue) {
            if (hasValue2) {
                throw AnonymousClass001.A0L("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            int resourceId = obtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                A06(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(9);
            if (string2 != null) {
                A03(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(19)) != null) {
            A0B(string);
        }
        this.A00 = obtainStyledAttributes.getResourceId(8, 0);
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.A02 = true;
        }
        if (obtainStyledAttributes.getBoolean(12, false)) {
            this.A08.A0V.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(17)) {
            int i2 = obtainStyledAttributes.getInt(17, 1);
            this.A09.add(KN3.SET_REPEAT_MODE);
            this.A08.A0V.setRepeatMode(i2);
        }
        if (obtainStyledAttributes.hasValue(16)) {
            A07(obtainStyledAttributes.getInt(16, -1));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            this.A08.A0V.A04 = obtainStyledAttributes.getFloat(18, 1.0f);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            boolean z2 = obtainStyledAttributes.getBoolean(4, true);
            JVZ jvz = this.A08;
            if (z2 != jvz.A0N) {
                jvz.A0N = z2;
                C3125Jjw c3125Jjw = jvz.A0G;
                if (c3125Jjw != null) {
                    c3125Jjw.A01 = z2;
                }
                jvz.invalidateSelf();
            }
        }
        if (obtainStyledAttributes.hasValue(3)) {
            boolean z3 = obtainStyledAttributes.getBoolean(3, false);
            JVZ jvz2 = this.A08;
            if (z3 != jvz2.A0M) {
                jvz2.A0M = z3;
                jvz2.invalidateSelf();
            }
        }
        if (obtainStyledAttributes.hasValue(6)) {
            String string3 = obtainStyledAttributes.getString(6);
            JVZ jvz3 = this.A08;
            jvz3.A0K = string3;
            if (jvz3.getCallback() != null) {
                Kkp kkp = jvz3.A0E;
                if (kkp == null) {
                    kkp = new Kkp(jvz3.getCallback());
                    jvz3.A0E = kkp;
                    String str = jvz3.A0K;
                    if (str != null) {
                        kkp.A00 = str;
                    }
                }
                kkp.A00 = string3;
            }
        }
        String string4 = obtainStyledAttributes.getString(11);
        JVZ jvz4 = this.A08;
        jvz4.A0L = string4;
        boolean hasValue4 = obtainStyledAttributes.hasValue(13);
        float f = obtainStyledAttributes.getFloat(13, 0.0f);
        if (hasValue4) {
            this.A09.add(KN3.SET_PROGRESS);
        }
        jvz4.A08(f);
        boolean z4 = obtainStyledAttributes.getBoolean(7, false);
        if (jvz4.A0O != z4) {
            jvz4.A0O = z4;
            if (jvz4.A0D != null) {
                JVZ.A01(jvz4);
            }
        }
        if (obtainStyledAttributes.hasValue(5)) {
            jvz4.A0B(new L8z("**"), new L34(new PorterDuffColorFilter(0Em.A02(context, obtainStyledAttributes.getResourceId(5, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)), MLa.A01);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            int i3 = obtainStyledAttributes.getInt(15, 0);
            if (i3 >= 0S2.A00(3).length) {
                i3 = 0;
            }
            jvz4.A0J = 0S2.A00(3)[i3];
            JVZ.A02(jvz4);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            if (i4 >= 0S2.A00(3).length) {
                i4 = 0;
            }
            jvz4.A0H = 0S2.A00(3)[i4];
        }
        jvz4.A0P = obtainStyledAttributes.getBoolean(10, false);
        if (obtainStyledAttributes.hasValue(20)) {
            jvz4.A0V.A09 = obtainStyledAttributes.getBoolean(20, false);
        }
        obtainStyledAttributes.recycle();
        if (Settings.Global.getFloat(context.getContentResolver(), 7zK.A00(24), 1.0f) != 0.0f) {
            z = true;
        }
        jvz4.A0R = Boolean.valueOf(z).booleanValue();
    }

    private void A02(LCD lcd) {
        L2w l2w = lcd.A03;
        Drawable drawable = this.A08;
        if (l2w != null && drawable == getDrawable() && ((JVZ) drawable).A0D == l2w.A00) {
            return;
        }
        this.A09.add(KN3.SET_ANIMATION);
        drawable.A04();
        A00();
        lcd.A03(this.A0A);
        lcd.A02(this.A0B);
        this.A05 = lcd;
    }

    private void A03(String str) {
        LCD lcd;
        this.A06 = str;
        this.A04 = 0;
        if (isInEditMode()) {
            Executor executor = LCD.A04;
            lcd = new LCD(new Ltd(str, this, 1), true);
        } else {
            boolean z = this.A03;
            Context context = getContext();
            if (z) {
                String A0W = 0Pz.A0W("asset_", str);
                lcd = LDc.A05((Runnable) null, A0W, new J58(context.getApplicationContext(), str, A0W, 0));
            } else {
                lcd = new LCD(new J58(context.getApplicationContext(), str, null, 0), false);
            }
        }
        A02(lcd);
    }

    public void A04() {
        this.A02 = false;
        this.A09.add(KN3.PLAY_OPTION);
        JVZ jvz = this.A08;
        jvz.A0W.clear();
        jvz.A0V.cancel();
        JQy.A1A(jvz);
    }

    public void A05() {
        this.A09.add(KN3.PLAY_OPTION);
        this.A08.A06();
    }

    public void A06(int i) {
        LCD lcd;
        this.A04 = i;
        this.A06 = null;
        if (isInEditMode()) {
            Executor executor = LCD.A04;
            lcd = new LCD(new J4z(i, 0, this), true);
        } else {
            boolean z = this.A03;
            Context context = getContext();
            if (z) {
                String A07 = LDc.A07(context, i);
                lcd = LDc.A05((Runnable) null, A07, new Ltj(7zL.A14(context), context.getApplicationContext(), A07, i, 2));
            } else {
                lcd = new LCD(new Ltj(7zL.A14(context), context.getApplicationContext(), null, i, 2), false);
            }
        }
        A02(lcd);
    }

    public void A07(int i) {
        this.A09.add(KN3.SET_REPEAT_COUNT);
        this.A08.A0V.setRepeatCount(i);
    }

    public void A08(L4k l4k) {
        float f;
        float f2;
        Drawable drawable = this.A08;
        drawable.setCallback(this);
        this.A07 = true;
        boolean z = false;
        if (((JVZ) drawable).A0D != l4k) {
            z = true;
            ((JVZ) drawable).A0Q = true;
            drawable.A04();
            ((JVZ) drawable).A0D = l4k;
            JVZ.A01(drawable);
            JUO juo = ((JVZ) drawable).A0V;
            boolean A1U = AnonymousClass001.A1U(juo.A07);
            juo.A07 = l4k;
            if (A1U) {
                f = Math.max(juo.A03, l4k.A03);
                f2 = Math.min(juo.A02, l4k.A00);
            } else {
                f = (int) l4k.A03;
                f2 = (int) l4k.A00;
            }
            JUO.A01(juo, f, f2);
            float f3 = juo.A00;
            juo.A00 = 0.0f;
            juo.A01 = 0.0f;
            juo.A07((int) f3);
            juo.A06();
            drawable.A08(juo.getAnimatedFraction());
            ArrayList arrayList = ((JVZ) drawable).A0W;
            Iterator A1D = GOp.A1D(arrayList);
            while (A1D.hasNext()) {
                MEg mEg = (MEg) A1D.next();
                if (mEg != null) {
                    mEg.Cio(l4k);
                }
                A1D.remove();
            }
            arrayList.clear();
            JVZ.A02(drawable);
            Drawable.Callback callback = drawable.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(drawable);
            }
        }
        if (this.A02) {
            drawable.A06();
        }
        this.A07 = false;
        if (getDrawable() == drawable) {
            if (!z) {
                return;
            }
        } else if (!z) {
            JUO juo2 = ((JVZ) drawable).A0V;
            boolean z2 = juo2 == null ? false : juo2.A08;
            setImageDrawable(null);
            setImageDrawable(drawable);
            if (z2) {
                drawable.A07();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.A0C.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onCompositionLoaded");
        }
    }

    public void A09(L8z l8z, MEm mEm, Object obj) {
        this.A08.A0B(l8z, new C3129Jk0(this, mEm), obj);
    }

    public void A0A(InputStream inputStream, String str) {
        A02(LDc.A05(new Lk8(inputStream), str, new Ltd(str, inputStream, 2)));
    }

    public void A0B(String str) {
        LCD lcd;
        boolean z = this.A03;
        Context context = getContext();
        if (z) {
            String A0W = 0Pz.A0W("url_", str);
            lcd = LDc.A05((Runnable) null, A0W, new J58(context, str, A0W, 1));
        } else {
            lcd = new LCD(new J58(context, str, null, 1), false);
        }
        A02(lcd);
    }

    public float getProgress() {
        return this.A08.A0V.A02();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        JVZ drawable = getDrawable();
        if (drawable instanceof JVZ) {
            if ((drawable.A0S ? 0S2.A0C : 0S2.A01) == 0S2.A0C) {
                this.A08.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        JVZ drawable2 = getDrawable();
        JVZ jvz = this.A08;
        if (drawable2 == jvz) {
            super.invalidateDrawable(jvz);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1997867980);
        super.onAttachedToWindow();
        if (!isInEditMode() && this.A02) {
            this.A08.A06();
        }
        0FI.A0C(461278712, A06);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A06 = savedState.A04;
        Set set = this.A09;
        KN3 kn3 = KN3.SET_ANIMATION;
        if (!set.contains(kn3) && !TextUtils.isEmpty(this.A06)) {
            A03(this.A06);
        }
        this.A04 = savedState.A01;
        if (!set.contains(kn3) && (i = this.A04) != 0) {
            A06(i);
        }
        if (!set.contains(KN3.SET_PROGRESS)) {
            this.A08.A08(savedState.A00);
        }
        if (!set.contains(KN3.PLAY_OPTION) && savedState.A06) {
            A05();
        }
        if (!set.contains(KN3.SET_IMAGE_ASSETS)) {
            this.A08.A0L = savedState.A05;
        }
        KN3 kn32 = KN3.SET_REPEAT_MODE;
        if (!set.contains(kn32)) {
            int i2 = savedState.A03;
            set.add(kn32);
            this.A08.A0V.setRepeatMode(i2);
        }
        if (set.contains(KN3.SET_REPEAT_COUNT)) {
            return;
        }
        A07(savedState.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0091, code lost:
    
        if (r0 == X.0S2.A0C) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.airbnb.lottie.LottieAnimationView$SavedState] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r301 = this;
            r0 = r301
            android.os.Parcelable r0 = super.onSaveInstanceState()
            r302 = r0
            com.airbnb.lottie.LottieAnimationView$SavedState r0 = new com.airbnb.lottie.LottieAnimationView$SavedState
            r303 = r0
            r0 = r303
            r1 = r302
            r0.<init>(r1)
            r0 = r301
            java.lang.String r0 = r0.A06
            r302 = r0
            r0 = r303
            r1 = r302
            r0.A04 = r1
            r0 = r301
            int r0 = r0.A04
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A01 = r1
            r0 = r301
            X.JVZ r0 = r0.A08
            r305 = r0
            r0 = r305
            X.JUO r0 = r0.A0V
            r306 = r0
            r0 = r306
            float r0 = r0.A02()
            r307 = r0
            r0 = r303
            r1 = r307
            r0.A00 = r1
            r0 = r305
            boolean r0 = r0.isVisible()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L76
            r0 = r306
            boolean r0 = r0.A08
            r308 = r0
        L4d:
            r0 = r303
            r1 = r308
            r0.A06 = r1
            r0 = r305
            java.lang.String r0 = r0.A0L
            r302 = r0
            r0 = r303
            r1 = r302
            r0.A05 = r1
            r0 = r306
            int r0 = r0.getRepeatMode()
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A03 = r1
            r0 = r306
            int r0 = r0.getRepeatCount()
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A02 = r1
            r0 = r303
            return r0
        L76:
            r0 = r305
            java.lang.Integer r0 = r0.A0I
            r309 = r0
            java.lang.Integer r0 = X.0S2.A01
            r302 = r0
            r0 = r309
            r1 = r302
            if (r0 == r1) goto L94
            java.lang.Integer r0 = X.0S2.A0C
            r302 = r0
            r0 = 0
            r308 = r0
            r0 = r309
            r1 = r302
            if (r0 != r1) goto L4d
        L94:
            r0 = 1
            r308 = r0
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.A04 = 0;
        this.A06 = null;
        A00();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.A04 = 0;
        this.A06 = null;
        A00();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.A04 = 0;
        this.A06 = null;
        A00();
        super.setImageResource(i);
    }

    public void setProgress(float f) {
        this.A09.add(KN3.SET_PROGRESS);
        this.A08.A08(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r0.A08 != false) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void unscheduleDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A07
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L36
            r0 = r301
            X.JVZ r0 = r0.A08
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L3f
            r0 = r304
            X.JUO r0 = r0.A0V
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3f
            r0 = r305
            boolean r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3f
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r301
            r1 = 0
            r0.A02 = r1
        L32:
            r0 = r304
            r0.A05()
        L36:
            r0 = r301
            r1 = r302
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            super.unscheduleDrawable(r1)
            return
        L3f:
            r0 = r302
            boolean r0 = r0 instanceof X.JVZ
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L36
            r0 = r302
            r304 = r0
            r0 = r302
            X.JVZ r0 = (X.JVZ) r0
            r304 = r0
            r0 = r304
            X.JUO r0 = r0.A0V
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L36
            r0 = r305
            boolean r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L36
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }
}
