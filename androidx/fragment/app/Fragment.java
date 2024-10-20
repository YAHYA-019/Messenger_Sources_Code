package androidx.fragment.app;

import X.06D;
import X.06V;
import X.06W;
import X.06Z;
import X.0AW;
import X.0FI;
import X.0Jt;
import X.0NQ;
import X.0Pz;
import X.0Tk;
import X.0Tl;
import X.0Tn;
import X.0UI;
import X.0xC;
import X.AbstractC00643oX;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass067;
import X.AnonymousClass068;
import X.AnonymousClass088;
import X.C05s;
import X.C05w;
import X.C06l;
import X.C07q;
import X.C07r;
import X.C09w;
import X.C09z;
import X.C0Ac;
import X.C0Am;
import X.C0np;
import X.C1ol;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Fragment.class */
public class Fragment implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, C05s, C05w, ComponentCallbacks, View.OnCreateContextMenuListener {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = 255;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public C09z mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    public boolean mCalled;
    public 06Z mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public ViewModelProvider.Factory mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public 06Z mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public 06V mHost;
    public boolean mInDynamicContainer;
    public boolean mInLayout;
    public boolean mIsCreated;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public LifecycleRegistry mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    public final AtomicInteger mNextLocalRequestCode;
    public final ArrayList mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public Handler mPostponedHandler;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public final C09w mSavedStateAttachListener;
    public AnonymousClass067 mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mTransitioning;
    public boolean mUserVisibleHint;
    public View mView;
    public C0Ac mViewLifecycleOwner;
    public MutableLiveData mViewLifecycleOwnerLiveData;
    public String mWho;

    /* loaded from: Fragment$SavedState.class */
    public final class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new 0Tn();
        public final Bundle A00;

        public SavedState(Bundle bundle) {
            this.A00 = bundle;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.A00 = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.A00);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new 06Z();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() { // from class: X.09u
            public static final String __redex_internal_original_name = "Fragment$1";

            @Override // java.lang.Runnable
            public void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new C09w() { // from class: X.09v
            @Override // X.C09w
            public void A00() {
                Fragment fragment = Fragment.this;
                fragment.mSavedStateRegistryController.A00();
                SavedStateHandleSupport.enableSavedStateHandles(fragment);
                Bundle bundle = fragment.mSavedFragmentState;
                fragment.mSavedStateRegistryController.A01(bundle != null ? bundle.getBundle("registryState") : null);
            }
        };
        initLifecycle();
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    public static 0UI A00(String str, StringBuilder sb) {
        sb.append(str);
        return new AndroidRuntimeException(sb.toString());
    }

    private C09z ensureAnimationInfo() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            c09z = new C09z();
            this.mAnimationInfo = c09z;
        }
        return c09z;
    }

    private int getMinimumMaxLifecycleState() {
        Fragment fragment;
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || (fragment = this.mParentFragment) == null) ? state.ordinal() : Math.min(state.ordinal(), fragment.getMinimumMaxLifecycleState());
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            0AW.A05(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment == null) {
            06Z r0 = this.mFragmentManager;
            if (r0 == null || (str = this.mTargetWho) == null) {
                return null;
            }
            fragment = r0.A0a(str);
        }
        return fragment;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = new AnonymousClass067(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C06l.A00(str, context.getClassLoader()).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e) {
            throw 0Pz.A00(str, ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw 0Pz.A00(str, ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw 0Pz.A00(str, ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw 0Pz.A00(str, ": calling Fragment constructor caused an exception", e4);
        }
    }

    private AnonymousClass088 prepareCallInternal(final C07q c07q, final 0Jt r303, final C07r c07r) {
        if (this.mState > 1) {
            throw AnonymousClass002.A0F(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).", AnonymousClass002.A0M(this));
        }
        final AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new C09w() { // from class: X.0x6
            @Override // X.C09w
            public void A00() {
                Fragment fragment = this;
                String generateActivityResultKey = fragment.generateActivityResultKey();
                06D r0 = (06D) r303.apply((Object) null);
                atomicReference.set(r0.A01(c07r, c07q, fragment, generateActivityResultKey));
            }
        });
        return new 0xC(c07q, this, atomicReference);
    }

    private void registerOnPreAttachListener(C09w c09w) {
        if (this.mState >= 0) {
            c09w.A00();
        } else {
            this.mOnPreAttachedListeners.add(c09w);
        }
    }

    private void restoreViewState() {
        if (06Z.A0O(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        06Z r0;
        C09z c09z = this.mAnimationInfo;
        if (c09z != null) {
            c09z.A0J = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (r0 = this.mFragmentManager) == null) {
            return;
        }
        C0Am A02 = C0Am.A02(viewGroup, r0);
        A02.A0B();
        if (z) {
            this.mHost.A02.post(new 0Tl(this, A02));
        } else {
            A02.A09();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public 06W createFragmentContainer() {
        return new 06W() { // from class: X.0A0
            public View A01(int i) {
                Fragment fragment = Fragment.this;
                View view = fragment.mView;
                if (view != null) {
                    return view.findViewById(i);
                }
                throw AnonymousClass002.A0F(" does not have a view", AnonymousClass002.A0M(fragment));
            }

            public boolean A02() {
                boolean z = false;
                if (Fragment.this.mView != null) {
                    z = true;
                }
                return z;
            }
        };
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        AnonymousClass002.A0U(printWriter, this.mFragmentId);
        printWriter.print(" mContainerId=#");
        AnonymousClass002.A0U(printWriter, this.mContainerId);
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getContext() != null) {
            0NQ.A00(this).A04(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Child ");
        A0k.append(this.mChildFragmentManager);
        printWriter.println(AnonymousClass001.A0d(":", A0k));
        this.mChildFragmentManager.A1S(0Pz.A0W(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.A0c(str);
    }

    public String generateActivityResultKey() {
        return 0Pz.A0F(this.mNextLocalRequestCode.getAndIncrement(), "fragment_", this.mWho, "_rq#");
    }

    public final FragmentActivity getActivity() {
        06V r0 = this.mHost;
        if (r0 == null) {
            return null;
        }
        return (FragmentActivity) r0.A00;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C09z c09z = this.mAnimationInfo;
        if (c09z == null || (bool = c09z.A09) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C09z c09z = this.mAnimationInfo;
        if (c09z == null || (bool = c09z.A0A) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final 06Z getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    public Context getContext() {
        06V r0 = this.mHost;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (X.06Z.A0O(3) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r0 = X.AnonymousClass001.A0k();
        r0.append("Could not find Application instance from Context ");
        r0.append(requireContext().getApplicationContext());
        android.util.Log.d("FragmentManager", X.AnonymousClass001.A0d(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r303 == null) goto L9;
     */
    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C1j9 getDefaultViewModelCreationExtras() {
        /*
            r301 = this;
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            r302 = r0
            r0 = r302
            android.content.Context r0 = r0.getApplicationContext()
            r303 = r0
        La:
            r0 = r303
            boolean r0 = r0 instanceof android.content.ContextWrapper
            r304 = r0
            r0 = r304
            if (r0 == 0) goto Lb2
            r0 = r303
            boolean r0 = r0 instanceof android.app.Application
            r304 = r0
            r0 = r304
            if (r0 == 0) goto La7
            r0 = r303
            if (r0 != 0) goto L5b
        L20:
            r0 = 3
            boolean r0 = X.06Z.A0O(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5b
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r305 = r0
            r0 = r305
            java.lang.String r1 = "Could not find Application instance from Context "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
            r302 = r0
            r0 = r305
            r1 = r302
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1 = r305
            java.lang.String r0 = X.AnonymousClass001.A0d(r0, r1)
            r305 = r0
            java.lang.String r0 = "FragmentManager"
            r302 = r0
            r0 = r302
            r1 = r305
            int r0 = android.util.Log.d(r0, r1)
        L5b:
            X.1jB r0 = new X.1jB
            r306 = r0
            r0 = r306
            r0.<init>()
            r0 = r303
            if (r0 == 0) goto L74
            X.1ew r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            r302 = r0
            r0 = r306
            r1 = r302
            r2 = r303
            r0.A01(r1, r2)
        L74:
            X.1ew r0 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            r302 = r0
            r0 = r306
            r1 = r302
            r2 = r301
            r0.A01(r1, r2)
            X.1ew r0 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            r302 = r0
            r0 = r306
            r1 = r302
            r2 = r301
            r0.A01(r1, r2)
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La1
            X.1ew r0 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            r302 = r0
            r0 = r306
            r1 = r302
            r2 = r305
            r0.A01(r1, r2)
        La1:
            r0 = r306
            X.1j9 r0 = (X.C1j9) r0
            return r0
        La7:
            r0 = r303
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            r303 = r0
            goto La
        Lb2:
            r0 = 0
            r303 = r0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getDefaultViewModelCreationExtras():X.1j9");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r304 == null) goto L13;
     */
    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        /*
            r301 = this;
            r0 = r301
            X.06Z r0 = r0.mFragmentManager
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L9b
            r0 = r301
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.mDefaultFactory
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L8b
            r0 = 0
            r304 = r0
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            r302 = r0
            r0 = r302
            android.content.Context r0 = r0.getApplicationContext()
            r303 = r0
        L1e:
            r0 = r303
            boolean r0 = r0 instanceof android.content.ContextWrapper
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3f
            r0 = r303
            boolean r0 = r0 instanceof android.app.Application
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L90
            r0 = r303
            r304 = r0
            r0 = r303
            android.app.Application r0 = (android.app.Application) r0
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L76
        L3f:
            r0 = 3
            boolean r0 = X.06Z.A0O(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L76
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r303 = r0
            r0 = r303
            java.lang.String r1 = "Could not find Application instance from Context "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            android.content.Context r0 = r0.getApplicationContext()
            r302 = r0
            r0 = r303
            r1 = r302
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1 = r303
            java.lang.String r0 = X.AnonymousClass001.A0d(r0, r1)
            r303 = r0
            java.lang.String r0 = "FragmentManager"
            r302 = r0
            r0 = r302
            r1 = r303
            int r0 = android.util.Log.d(r0, r1)
        L76:
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r302 = r0
            androidx.lifecycle.SavedStateViewModelFactory r0 = new androidx.lifecycle.SavedStateViewModelFactory
            r303 = r0
            r0 = r303
            r1 = r304
            r2 = r301
            r3 = r302
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r303
            r0.mDefaultFactory = r1
        L8b:
            r0 = r303
            androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
            return r0
        L90:
            r0 = r303
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            r303 = r0
            goto L1e
        L9b:
            java.lang.String r0 = "Can't access ViewModels from detached fragment"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getDefaultViewModelProviderFactory():androidx.lifecycle.ViewModelProvider$Factory");
    }

    public int getEnterAnim() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return 0;
        }
        return c09z.A01;
    }

    public Object getEnterTransition() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return null;
        }
        return c09z.A0B;
    }

    public AbstractC00643oX getEnterTransitionCallback() {
        return null;
    }

    public int getExitAnim() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return 0;
        }
        return c09z.A02;
    }

    public Object getExitTransition() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return null;
        }
        return c09z.A0C;
    }

    public AbstractC00643oX getExitTransitionCallback() {
        return null;
    }

    public View getFocusedView() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return null;
        }
        return c09z.A06;
    }

    public final 06Z getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        06V r0 = this.mHost;
        if (r0 == null) {
            return null;
        }
        return r0.A04();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater == null) {
            layoutInflater = onGetLayoutInflater(null);
            this.mLayoutInflater = layoutInflater;
        }
        return layoutInflater;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        06V r0 = this.mHost;
        if (r0 == null) {
            throw AnonymousClass001.A0N("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater A03 = r0.A03();
        A03.setFactory2(this.mChildFragmentManager.A0R);
        return A03;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public 0NQ getLoaderManager() {
        return 0NQ.A00(this);
    }

    public int getNextTransition() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return 0;
        }
        return c09z.A03;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final 06Z getParentFragmentManager() {
        06Z r0 = this.mFragmentManager;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass002.A0F(" not associated with a fragment manager.", AnonymousClass002.A0M(this));
    }

    public boolean getPopDirection() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return false;
        }
        return c09z.A0K;
    }

    public int getPopEnterAnim() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return 0;
        }
        return c09z.A04;
    }

    public int getPopExitAnim() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return 0;
        }
        return c09z.A05;
    }

    public float getPostOnViewCreatedAlpha() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return 1.0f;
        }
        return c09z.A00;
    }

    public Object getReenterTransition() {
        Object obj;
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            obj = null;
        } else {
            obj = c09z.A0D;
            if (obj == USE_DEFAULT_TRANSITION) {
                return getExitTransition();
            }
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        0AW.A03(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        Object obj;
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            obj = null;
        } else {
            obj = c09z.A0E;
            if (obj == USE_DEFAULT_TRANSITION) {
                return getEnterTransition();
            }
        }
        return obj;
    }

    @Override // X.C05s
    public final AnonymousClass068 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.A01;
    }

    public Object getSharedElementEnterTransition() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return null;
        }
        return c09z.A0F;
    }

    public Object getSharedElementReturnTransition() {
        Object obj;
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            obj = null;
        } else {
            obj = c09z.A0G;
            if (obj == USE_DEFAULT_TRANSITION) {
                return getSharedElementEnterTransition();
            }
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r302 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList getSharedElementSourceNames() {
        /*
            r301 = this;
            r0 = r301
            X.09z r0 = r0.mAnimationInfo
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L12
            r0 = r302
            java.util.ArrayList r0 = r0.A0H
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L16
        L12:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getSharedElementSourceNames():java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r302 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList getSharedElementTargetNames() {
        /*
            r301 = this;
            r0 = r301
            X.09z r0 = r0.mAnimationInfo
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L12
            r0 = r302
            java.util.ArrayList r0 = r0.A0I
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L16
        L12:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getSharedElementTargetNames():java.util.ArrayList");
    }

    public final String getString(int i) {
        return requireContext().getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return requireContext().getResources().getString(i, objArr);
    }

    public final String getTag() {
        return this.mTag;
    }

    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    public final int getTargetRequestCode() {
        0AW.A04(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return requireContext().getResources().getText(i);
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        C0Ac c0Ac = this.mViewLifecycleOwner;
        if (c0Ac != null) {
            return c0Ac;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Can't access the Fragment View's LifecycleOwner for ");
        A0k.append(this);
        throw AnonymousClass002.A0F(" when getView() is null i.e., before onCreateView() or after onDestroyView()", A0k);
    }

    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        06Z r0 = this.mFragmentManager;
        if (r0 == null) {
            throw AnonymousClass001.A0N("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != 1) {
            return r0.A0i(this);
        }
        throw AnonymousClass001.A0N("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new 06Z();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.mAdded == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isAdded() {
        /*
            r301 = this;
            r0 = r301
            X.06V r0 = r0.mHost
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r301
            boolean r0 = r0.mAdded
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isAdded():boolean");
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        return this.mFragmentManager != null && 06Z.A0P(this.mParentFragment);
    }

    public final boolean isInBackStack() {
        boolean z = false;
        if (this.mBackStackNesting > 0) {
            z = true;
        }
        return z;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            return this.mFragmentManager == null || 06Z.A0Q(this.mParentFragment);
        }
        return false;
    }

    public boolean isPostponed() {
        C09z c09z = this.mAnimationInfo;
        if (c09z == null) {
            return false;
        }
        return c09z.A0J;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        boolean z = false;
        if (this.mState >= 7) {
            z = true;
        }
        return z;
    }

    public final boolean isStateSaved() {
        06Z r0 = this.mFragmentManager;
        if (r0 == null) {
            return false;
        }
        return r0.A1U();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r301.mView.getVisibility() != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isVisible() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isAdded()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L34
            r0 = r301
            boolean r0 = r0.isHidden()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L34
            r0 = r301
            android.view.View r0 = r0.mView
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L34
            r0 = r303
            android.os.IBinder r0 = r0.getWindowToken()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L34
            r0 = r301
            android.view.View r0 = r0.mView
            r303 = r0
            r0 = r303
            int r0 = r0.getVisibility()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L38
        L34:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L38:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isVisible():boolean");
    }

    /* renamed from: lambda$performCreateView$0$androidx-fragment-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m5411lambda$performCreateView$0$androidxfragmentappFragment() {
        this.mViewLifecycleOwner.A01(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.A0v();
    }

    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-1986149221);
        this.mCalled = true;
        0FI.A08(1469501862, A02);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (06Z.A0N()) {
            StringBuilder A0M = AnonymousClass002.A0M(this);
            A0M.append(" received the following in onActivityResult(): requestCode: ");
            A0M.append(i);
            A0M.append(" resultCode: ");
            A0M.append(i2);
            AnonymousClass002.A0X(intent, " data: ", A0M);
        }
    }

    public void onAttach(Activity activity) {
        int A02 = 0FI.A02(894618012);
        this.mCalled = true;
        0FI.A08(-1276121473, A02);
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        06V r0 = this.mHost;
        if (r0 == null || (activity = r0.A00) == null) {
            return;
        }
        this.mCalled = false;
        onAttach(activity);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(412399288);
        this.mCalled = true;
        restoreChildFragmentState();
        06Z r0 = this.mChildFragmentManager;
        if (r0.A00 < 1) {
            r0.A0m();
        }
        0FI.A08(1111400336, A02);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        int i;
        int A02 = 0FI.A02(-1027310901);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            view = layoutInflater.inflate(i2, viewGroup, false);
            i = 1445078932;
        } else {
            view = null;
            i = 1196706451;
        }
        0FI.A08(i, A02);
        return view;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(1429640738);
        this.mCalled = true;
        0FI.A08(55621516, A02);
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-961299403);
        this.mCalled = true;
        0FI.A08(223467279, A02);
    }

    public void onDetach() {
        int A02 = 0FI.A02(1887423784);
        this.mCalled = true;
        0FI.A08(1766004772, A02);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        06V r0 = this.mHost;
        if (r0 == null || r0.A00 == null) {
            return;
        }
        this.mCalled = false;
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        int A02 = 0FI.A02(-741365511);
        this.mCalled = true;
        0FI.A08(257018534, A02);
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        int A02 = 0FI.A02(339993235);
        this.mCalled = true;
        0FI.A08(-70928354, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        int A02 = 0FI.A02(-179177744);
        this.mCalled = true;
        0FI.A08(84446793, A02);
    }

    public void onStop() {
        int A02 = 0FI.A02(1602857852);
        this.mCalled = true;
        0FI.A08(1867857833, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        int A02 = 0FI.A02(865006028);
        this.mCalled = true;
        0FI.A08(881477546, A02);
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.A0v();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw A00(" did not call through to super.onActivityCreated()", AnonymousClass002.A0M(this));
        }
        restoreViewState();
        this.mChildFragmentManager.A0k();
    }

    public void performAttach() {
        Iterator it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            ((C09w) it.next()).A00();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.A1E(this, createFragmentContainer(), this.mHost);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.A01);
        if (!this.mCalled) {
            throw A00(" did not call through to super.onAttach()", AnonymousClass002.A0M(this));
        }
        this.mFragmentManager.A18(this);
        this.mChildFragmentManager.A0l();
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.A1Y(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.A0v();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new C0np(this, 3));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw A00(" did not call through to super.onCreate()", AnonymousClass002.A0M(this));
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                z = true;
            }
            z |= this.mChildFragmentManager.A1X(menu, menuInflater);
        }
        return z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.A0v();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0Ac(this, getViewModelStore(), new Runnable() { // from class: X.0Ab
            public static final String __redex_internal_original_name = "Fragment$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                Fragment.this.m5411lambda$performCreateView$0$androidxfragmentappFragment();
            }
        });
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        C0Ac c0Ac = this.mViewLifecycleOwner;
        if (onCreateView == null) {
            if (c0Ac.A05()) {
                throw AnonymousClass001.A0N("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        c0Ac.A00();
        if (06Z.A0O(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting ViewLifecycleOwner on View ");
            sb.append(this.mView);
            sb.append(" for Fragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        ViewTreeLifecycleOwner.set(this.mView, this.mViewLifecycleOwner);
        ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
        C1ol.A01(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.A0n();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw A00(" did not call through to super.onDestroy()", AnonymousClass002.A0M(this));
        }
    }

    public void performDestroyView() {
        06Z.A0I(this.mChildFragmentManager, 1);
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.A03(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw A00(" did not call through to super.onDestroyView()", AnonymousClass002.A0M(this));
        }
        0NQ.A00(this).A02();
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw A00(" did not call through to super.onDetach()", AnonymousClass002.A0M(this));
        }
        06Z r0 = this.mChildFragmentManager;
        if (r0.A0B) {
            return;
        }
        r0.A0n();
        this.mChildFragmentManager = new 06Z();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.A1Z(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        this.mChildFragmentManager.A13(menu);
    }

    public void performPause() {
        06Z.A0I(this.mChildFragmentManager, 5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.A03(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw A00(" did not call through to super.onPause()", AnonymousClass002.A0M(this));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                z = true;
            }
            z |= this.mChildFragmentManager.A1W(menu);
        }
        return z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean A1a = this.mFragmentManager.A1a(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != A1a) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(A1a);
            this.mChildFragmentManager.A0p();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.A0v();
        this.mChildFragmentManager.A1T(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw A00(" did not call through to super.onResume()", AnonymousClass002.A0M(this));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.A03(event);
        }
        this.mChildFragmentManager.A0q();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.A0v();
        this.mChildFragmentManager.A1T(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw A00(" did not call through to super.onStart()", AnonymousClass002.A0M(this));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.A03(event);
        }
        this.mChildFragmentManager.A0r();
    }

    public void performStop() {
        this.mChildFragmentManager.A0s();
        if (this.mView != null) {
            this.mViewLifecycleOwner.A03(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw A00(" did not call through to super.onStop()", AnonymousClass002.A0M(this));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        06Z.A0I(this.mChildFragmentManager, 2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().A0J = true;
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        ensureAnimationInfo().A0J = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        06Z r0 = this.mFragmentManager;
        Handler A07 = r0 != null ? r0.A05.A02 : AnonymousClass001.A07();
        this.mPostponedHandler = A07;
        A07.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final AnonymousClass088 registerForActivityResult(C07q c07q, final 06D r303, C07r c07r) {
        return prepareCallInternal(c07q, new 0Jt() { // from class: X.0x7
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return r303;
            }
        }, c07r);
    }

    @Override // X.C05w
    public final AnonymousClass088 registerForActivityResult(C07q c07q, C07r c07r) {
        return prepareCallInternal(c07q, new 0Jt() { // from class: X.0x9
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                Fragment fragment = Fragment.this;
                C05t c05t = fragment.mHost;
                return c05t instanceof C05t ? c05t.AVc() : fragment.requireActivity().AVc();
            }
        }, c07r);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            throw AnonymousClass002.A0F(" not attached to Activity", AnonymousClass002.A0M(this));
        }
        getParentFragmentManager().A1H(this, strArr, i);
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw AnonymousClass002.A0F(" not attached to an activity.", AnonymousClass002.A0M(this));
    }

    public final Bundle requireArguments() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle;
        }
        throw AnonymousClass002.A0F(" does not have any arguments.", AnonymousClass002.A0M(this));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw AnonymousClass002.A0F(" not attached to a context.", AnonymousClass002.A0M(this));
    }

    public final 06Z requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw AnonymousClass002.A0F(" not attached to a host.", AnonymousClass002.A0M(this));
    }

    public final Fragment requireParentFragment() {
        Fragment fragment = this.mParentFragment;
        if (fragment != null) {
            return fragment;
        }
        Context context = getContext();
        StringBuilder A0n = AnonymousClass001.A0n("Fragment ");
        if (context == null) {
            A0n.append(this);
            throw AnonymousClass002.A0F(" is not attached to any Fragment or host", A0n);
        }
        A0n.append(this);
        A0n.append(" is not a child Fragment, it is directly attached to ");
        throw AnonymousClass002.A0E(getContext(), A0n);
    }

    public final View requireView() {
        View view = this.mView;
        if (view != null) {
            return view;
        }
        throw AnonymousClass002.A0F(" did not return a View from onCreateView() or this was called before onCreateView().", AnonymousClass002.A0M(this));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.A12(bundle);
        this.mChildFragmentManager.A0m();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw A00(" did not call through to super.onViewStateRestored()", AnonymousClass002.A0M(this));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.A03(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().A09 = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().A0A = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().A01 = i;
        ensureAnimationInfo().A02 = i2;
        ensureAnimationInfo().A04 = i3;
        ensureAnimationInfo().A05 = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw AnonymousClass001.A0N("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC00643oX abstractC00643oX) {
        ensureAnimationInfo().A07 = abstractC00643oX;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().A0B = obj;
    }

    public void setExitSharedElementCallback(AbstractC00643oX abstractC00643oX) {
        ensureAnimationInfo().A08 = abstractC00643oX;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().A0C = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().A06 = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.A05();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r303 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setInitialSavedState(androidx.fragment.app.Fragment.SavedState r302) {
        /*
            r301 = this;
            r0 = r301
            X.06Z r0 = r0.mFragmentManager
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1e
            r0 = r302
            if (r0 == 0) goto L16
            r0 = r302
            android.os.Bundle r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L16:
            r0 = 0
            r303 = r0
        L18:
            r0 = r301
            r1 = r303
            r0.mSavedFragmentState = r1
            return
        L1e:
            java.lang.String r0 = "Fragment already added"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.setInitialSavedState(androidx.fragment.app.Fragment$SavedState):void");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.A05();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.A03 = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().A0K = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().A00 = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().A0D = obj;
    }

    public void setRetainInstance(boolean z) {
        0AW.A06(this);
        this.mRetainInstance = z;
        06Z r0 = this.mFragmentManager;
        if (r0 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            r0.A15(this);
        } else {
            r0.A1C(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().A0E = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().A0F = obj;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        ensureAnimationInfo();
        C09z c09z = this.mAnimationInfo;
        c09z.A0H = arrayList;
        c09z.A0I = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().A0G = obj;
    }

    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            0AW.A07(this, fragment, i);
        }
        06Z r0 = this.mFragmentManager;
        06Z r305 = fragment != null ? fragment.mFragmentManager : null;
        if (r0 != null && r305 != null && r0 != r305) {
            throw AnonymousClass002.A0D(" must share the same FragmentManager to be set as a target fragment", AnonymousClass002.A0M(fragment));
        }
        Fragment fragment2 = fragment;
        while (true) {
            Fragment fragment3 = fragment2;
            if (fragment3 == null) {
                if (fragment == null) {
                    this.mTargetWho = null;
                    this.mTarget = null;
                } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                    this.mTargetWho = null;
                    this.mTarget = fragment;
                } else {
                    this.mTargetWho = fragment.mWho;
                    this.mTarget = null;
                }
                this.mTargetRequestCode = i;
                return;
            }
            if (fragment3.equals(this)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Setting ");
                A0k.append(fragment);
                A0k.append(" as the target of ");
                A0k.append(this);
                throw AnonymousClass002.A0D(" would create a target cycle", A0k);
            }
            fragment2 = fragment3.getTargetFragment(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r302 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setUserVisibleHint(boolean r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            X.0AW.A0A(r0, r1)
            r0 = r301
            boolean r0 = r0.mUserVisibleHint
            r303 = r0
            r0 = 5
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L4a
            r0 = r302
            if (r0 == 0) goto L4a
            r0 = r301
            int r0 = r0.mState
            r303 = r0
            r0 = r303
            r1 = r304
            if (r0 >= r1) goto L4a
            r0 = r301
            X.06Z r0 = r0.mFragmentManager
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L4a
            r0 = r301
            boolean r0 = r0.isAdded()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4a
            r0 = r301
            boolean r0 = r0.mIsCreated
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4a
            r0 = r305
            r1 = r301
            X.09y r0 = r0.A0g(r1)
            r306 = r0
            r0 = r305
            r1 = r306
            r0.A1P(r1)
        L4a:
            r0 = r301
            r1 = r302
            r0.mUserVisibleHint = r1
            r0 = r301
            int r0 = r0.mState
            r303 = r0
            r0 = r303
            r1 = r304
            if (r0 >= r1) goto L5f
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L64
        L5f:
            r0 = 0
            r303 = r0
            r0 = 0
            r306 = r0
        L64:
            r0 = r301
            r1 = r303
            r0.mDeferStart = r1
            r0 = r301
            android.os.Bundle r0 = r0.mSavedFragmentState
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L80
            r0 = r302
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r306 = r0
            r0 = r301
            r1 = r306
            r0.mSavedUserVisibleHint = r1
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.setUserVisibleHint(boolean):void");
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        06V r0 = this.mHost;
        if (r0 != null) {
            return r0.A08(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        06V r0 = this.mHost;
        if (r0 == null) {
            throw AnonymousClass002.A0F(" not attached to Activity", AnonymousClass002.A0M(this));
        }
        r0.A06(intent, bundle, this, -1);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            throw AnonymousClass002.A0F(" not attached to Activity", AnonymousClass002.A0M(this));
        }
        getParentFragmentManager().A10(intent, bundle, this, i);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost == null) {
            throw AnonymousClass002.A0F(" not attached to Activity", AnonymousClass001.A0m(this, "Fragment "));
        }
        if (06Z.A0O(2)) {
            StringBuilder A0m = AnonymousClass001.A0m(this, "Fragment ");
            A0m.append(" received the following in startIntentSenderForResult() requestCode: ");
            A0m.append(i);
            A0m.append(" IntentSender: ");
            A0m.append(intentSender);
            A0m.append(" fillInIntent: ");
            A0m.append(intent);
            AnonymousClass002.A0X(bundle, " options: ", A0m);
        }
        getParentFragmentManager().A0z(intent, intentSender, bundle, this, i, i2, i3, i4);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().A0J) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().A0J = false;
        } else if (Looper.myLooper() != this.mHost.A02.getLooper()) {
            this.mHost.A02.postAtFrontOfQueue(new 0Tk(this));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        int i = this.mFragmentId;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.mTag;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
