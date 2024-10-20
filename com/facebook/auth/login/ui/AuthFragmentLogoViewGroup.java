package com.facebook.auth.login.ui;

import X.0FI;
import X.1BK;
import X.1Bn;
import X.4YU;
import X.C09s;
import X.C0A2;
import X.DKF;
import X.DKG;
import X.EKa;
import X.Erh;
import X.F8h;
import X.Fai;
import X.Faj;
import X.GE4;
import X.GHU;
import X.RkA;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;

/* loaded from: AuthFragmentLogoViewGroup.class */
public abstract class AuthFragmentLogoViewGroup extends AuthFragmentViewGroup {
    public static final String HELP_URL = "orca:authparam:help_url";
    public static final String HIDE_LOGO_ON_SMALL_DISPLAYS = "orca:authparam:hide_logo";
    public static final String LAYOUT_RESOURCE = "orca:authparam:layout_resource";
    public static final int LOGIN_GROUP_ANIM_DELAY_MS = 375;
    public static final int LOGIN_GROUP_ANIM_DURATION_MS = 125;
    public static final String LOGO1_RESOURCE = "orca:authparam:logo1";
    public static final String LOGO2_RESOURCE = "orca:authparam:logo2";
    public static final int SLIDE_ANIM_DELAY_MS = 200;
    public static final int SLIDE_ANIM_DURATION_MS = 500;
    public static final String SPLASH_LOGO1_RESOURCE = "orca:authparam:spash_logo1";
    public static final String SPLASH_LOGO2_RESOURCE = "orca:authparam:spash_logo2";
    public static final String SPLASH_TRANSITION = "orca:authparam:splash_transition";
    public final View mBottomGroup;
    public Erh mDynamicLayoutUtil;
    public final int mEnterTransitionAnimation;
    public final int mExitTransitionAnimation;
    public final ImageButton mHelpButton;
    public final boolean mHideLogoOnSmallDisplays;
    public final GHU mLayoutDelegate;
    public final int mLogo1ResId;
    public final ImageView mLogo1View;
    public final int mLogo2ResId;
    public final ImageView mLogo2View;
    public final View mLogoGroup;
    public final View mMainGroup;
    public final int mPopEnterTransitionAnimation;
    public final int mPopExitTransitionAnimation;
    public final View mRootGroup;
    public final View mSplashGroup;
    public int mSplashLogo1ResId;
    public final ImageView mSplashLogo1View;
    public int mSplashLogo2ResId;
    public final ImageView mSplashLogo2View;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthFragmentLogoViewGroup(Context context, GE4 ge4) {
        super(context, ge4);
        this.mDynamicLayoutUtil = (Erh) 1Bn.A0A(100055);
        setContentView(getResourceArgument(LAYOUT_RESOURCE, getDefaultLayoutResource()));
        this.mSplashGroup = C09s.A01(this, 2131365360);
        this.mSplashLogo1View = (ImageView) C09s.A01(this, 2131365354);
        this.mSplashLogo2View = (ImageView) C09s.A01(this, 2131365356);
        this.mRootGroup = C09s.A01(this, 2131365359);
        this.mMainGroup = C09s.A01(this, 2131365358);
        this.mBottomGroup = C09s.A01(this, 2131365346);
        this.mLogoGroup = C09s.A01(this, 2131365357);
        this.mLogo1View = (ImageView) C09s.A01(this, 2131365353);
        this.mLogo2View = (ImageView) C09s.A01(this, 2131365355);
        this.mHelpButton = (ImageButton) C09s.A01(this, 2131365352);
        int resourceArgument = getResourceArgument(LOGO1_RESOURCE, 0);
        this.mLogo1ResId = resourceArgument;
        int resourceArgument2 = getResourceArgument(LOGO2_RESOURCE, 0);
        this.mLogo2ResId = resourceArgument2;
        this.mSplashLogo1ResId = getResourceArgument(SPLASH_LOGO1_RESOURCE, 0);
        int resourceArgument3 = getResourceArgument(SPLASH_LOGO2_RESOURCE, 0);
        this.mSplashLogo2ResId = resourceArgument3;
        if (this.mSplashLogo1ResId == 0) {
            this.mSplashLogo1ResId = resourceArgument;
        }
        if (resourceArgument3 == 0) {
            this.mSplashLogo2ResId = resourceArgument2;
        }
        this.mEnterTransitionAnimation = getResourceArgument("com.facebook.fragment.ENTER_ANIM", 0);
        this.mExitTransitionAnimation = getResourceArgument("com.facebook.fragment.EXIT_ANIM", 0);
        this.mPopEnterTransitionAnimation = getResourceArgument("com.facebook.fragment.POP_ENTER_ANIM", 0);
        this.mPopExitTransitionAnimation = getResourceArgument("com.facebook.fragment.POP_EXIT_ANIM", 0);
        if (getArguments() != null) {
            this.mHideLogoOnSmallDisplays = getArguments().getBoolean("orca:authparam:hide_logo", false);
        } else {
            this.mHideLogoOnSmallDisplays = false;
        }
        setupViewSizeBasedVisibility();
        this.mLayoutDelegate = isLegacyLayout() ? new Fai(this) : new Faj(this);
    }

    public static Bundle createParameterBundle(int i, int i2, int i3) {
        return createParameterBundle(i, i2, i3, 0, 0, EKa.A01, null);
    }

    public static Bundle createParameterBundle(int i, int i2, int i3, int i4, int i5, EKa eKa, int i6, int i7, int i8, int i9, boolean z, String str) {
        Bundle A05 = 1BK.A05();
        A05.putInt(LAYOUT_RESOURCE, i);
        A05.putInt(LOGO1_RESOURCE, i2);
        A05.putInt(LOGO2_RESOURCE, i3);
        A05.putInt(SPLASH_LOGO1_RESOURCE, i4);
        A05.putInt(SPLASH_LOGO2_RESOURCE, i5);
        A05.putSerializable(SPLASH_TRANSITION, eKa);
        A05.putInt("com.facebook.fragment.ENTER_ANIM", i6);
        A05.putInt("com.facebook.fragment.EXIT_ANIM", i7);
        A05.putInt("com.facebook.fragment.POP_ENTER_ANIM", i8);
        A05.putInt("com.facebook.fragment.POP_EXIT_ANIM", i9);
        A05.putString(HELP_URL, str);
        A05.putBoolean("orca:authparam:hide_logo", z);
        return A05;
    }

    public static Bundle createParameterBundle(int i, int i2, int i3, int i4, int i5, EKa eKa, String str) {
        return createParameterBundle(i, i2, i3, i4, i5, eKa, 0, 0, 0, 0, false, str);
    }

    public static Bundle createParameterBundle(int i, int i2, int i3, String str) {
        return createParameterBundle(i, i2, i3, 0, 0, EKa.A01, str);
    }

    public static Bundle createParameterBundle(int i, int i2, int i3, boolean z) {
        return createParameterBundle(i, i2, i3, 0, 0, EKa.A01, 0, 0, 0, 0, z, null);
    }

    private boolean isLegacyLayout() {
        View[] viewArr = {this.mSplashGroup, this.mSplashLogo1View, this.mSplashLogo2View, this.mRootGroup, this.mMainGroup, this.mBottomGroup, this.mLogoGroup, this.mHelpButton};
        int i = 0;
        while (viewArr[i] != null) {
            i++;
            if (i >= 8) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setupViewSizeBasedVisibility() {
        if (this.mHideLogoOnSmallDisplays) {
            Erh erh = this.mDynamicLayoutUtil;
            View rootView = getRootView();
            Resources resources = getResources();
            int integer = resources.getInteger(2131427334);
            rootView.getViewTreeObserver().addOnGlobalLayoutListener(new RkA(rootView, erh, ImmutableList.of((Object) 2131365357), integer));
            this.mDynamicLayoutUtil.A00(getRootView(), ImmutableList.of((Object) 2131368067), ImmutableList.of((Object) 2132279591), ImmutableList.of((Object) 2132279632), resources.getInteger(2131427330));
        }
    }

    public abstract int getDefaultLayoutResource();

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1800606462);
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        this.mLayoutDelegate.onAttachedToWindow();
        0FI.A0C(-595472302, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        this.mLayoutDelegate.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.Fragment, com.facebook.auth.login.ui.AuthFragmentBase] */
    public void onHelpClick() {
        getArguments().getClass();
        Uri A03 = C0A2.A03(getArguments().getString(HELP_URL));
        GE4 ge4 = this.control;
        Intent A09 = 4YU.A09(A03);
        ?? r0 = (AuthFragmentBase) ge4;
        DKF.A15(A09, (Fragment) r0, DKG.A0t(r0.A02));
    }

    @Override // com.facebook.auth.login.ui.AuthFragmentViewGroup
    public void setCustomAnimations(F8h f8h) {
        f8h.A02(this.mEnterTransitionAnimation, this.mExitTransitionAnimation, this.mPopEnterTransitionAnimation, this.mPopExitTransitionAnimation);
    }
}
