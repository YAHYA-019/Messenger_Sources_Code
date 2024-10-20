package androidx.activity;

import X.06A;
import X.06B;
import X.06C;
import X.06D;
import X.06P;
import X.06Q;
import X.06R;
import X.06T;
import X.07Z;
import X.0FI;
import X.0Pz;
import X.0V0;
import X.0V1;
import X.0fV;
import X.11T;
import X.1jB;
import X.9fD;
import X.AnonymousClass001;
import X.AnonymousClass063;
import X.AnonymousClass066;
import X.AnonymousClass067;
import X.AnonymousClass068;
import X.AnonymousClass069;
import X.AnonymousClass088;
import X.C01g;
import X.C01i;
import X.C05s;
import X.C05t;
import X.C05u;
import X.C05v;
import X.C05w;
import X.C06i;
import X.C06j;
import X.C06k;
import X.C07j;
import X.C07q;
import X.C07r;
import X.C08i;
import X.C0B7;
import X.C0np;
import X.C1ei;
import X.C1ej;
import X.C1ek;
import X.C1el;
import X.C1ew;
import X.C1j9;
import X.C1ol;
import X.C9gy;
import X.Krt;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ComponentActivity.class */
public abstract class ComponentActivity extends androidx.core.app.ComponentActivity implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, C05s, C1ei, C05t, C1ej, C1ek, C1el, C05u, C05v, C05w {
    public ViewModelStore _viewModelStore;
    public final 06D activityResultRegistry;
    public int contentLayoutId;
    public final C01i defaultViewModelProviderFactory$delegate;
    public boolean dispatchingOnMultiWindowModeChanged;
    public boolean dispatchingOnPictureInPictureModeChanged;
    public final C01i fullyDrawnReporter$delegate;
    public final AtomicInteger nextLocalRequestCode;
    public final C01i onBackPressedDispatcher$delegate;
    public final CopyOnWriteArrayList onConfigurationChangedListeners;
    public final CopyOnWriteArrayList onMultiWindowModeChangedListeners;
    public final CopyOnWriteArrayList onNewIntentListeners;
    public final CopyOnWriteArrayList onPictureInPictureModeChangedListeners;
    public final CopyOnWriteArrayList onTrimMemoryListeners;
    public final CopyOnWriteArrayList onUserLeaveHintListeners;
    public final 06A reportFullyDrawnExecutor;
    public final AnonymousClass067 savedStateRegistryController;
    public final AnonymousClass063 contextAwareHelper = new AnonymousClass063();
    public final AnonymousClass066 menuHostHelper = new AnonymousClass066(new Runnable() { // from class: X.065
        public static final String __redex_internal_original_name = "ComponentActivity$$ExternalSyntheticLambda1";

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.invalidateOptionsMenu();
        }
    });

    public ComponentActivity() {
        AnonymousClass067 anonymousClass067 = new AnonymousClass067(this);
        this.savedStateRegistryController = anonymousClass067;
        this.reportFullyDrawnExecutor = new AnonymousClass069(this);
        this.fullyDrawnReporter$delegate = C01g.A01(new 06B(this));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new 06C(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList();
        this.onNewIntentListeners = new CopyOnWriteArrayList();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList();
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle == null) {
            throw AnonymousClass001.A0N("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        lifecycle.addObserver(new C0np(this, 0));
        getLifecycle().addObserver(new C0np(this, 1));
        getLifecycle().addObserver(new C0np(this, 2));
        anonymousClass067.A00();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        this.savedStateRegistryController.A01.A02(new 0fV(this, 0), "android:support:activity-result");
        A2U(new 06P(this));
        this.defaultViewModelProviderFactory$delegate = C01g.A01(new 06R(this));
        this.onBackPressedDispatcher$delegate = C01g.A01(new 06T(this));
    }

    public static /* synthetic */ Bundle A13(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        06D r0 = componentActivity.activityResultRegistry;
        Map map = r0.A02;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(r0.A01));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(r0.A00));
        return bundle;
    }

    private void A15() {
        View decorView = getWindow().getDecorView();
        11T.A0A(decorView);
        ViewTreeLifecycleOwner.set(decorView, this);
        View decorView2 = getWindow().getDecorView();
        11T.A0A(decorView2);
        ViewTreeViewModelStoreOwner.set(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        11T.A0A(decorView3);
        C1ol.A01(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        11T.A0A(decorView4);
        decorView4.setTag(2131368401, this);
        View decorView5 = getWindow().getDecorView();
        11T.A0A(decorView5);
        decorView5.setTag(2131366913, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A16() {
        if (this._viewModelStore == null) {
            C07j c07j = (C07j) getLastNonConfigurationInstance();
            if (c07j != null) {
                this._viewModelStore = c07j.A00;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
    }

    public static /* synthetic */ void A17(ComponentActivity componentActivity) {
        Bundle A00 = componentActivity.savedStateRegistryController.A01.A00("android:support:activity-result");
        if (A00 != null) {
            06D r0 = componentActivity.activityResultRegistry;
            ArrayList<Integer> integerArrayList = A00.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = A00.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = A00.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                r0.A01.addAll(stringArrayList2);
            }
            Bundle bundle = A00.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                r0.A00.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                Map map = r0.A02;
                if (map.containsKey(str)) {
                    Object remove = map.remove(str);
                    if (!r0.A00.containsKey(str)) {
                        C0B7.A02(r0.A04).remove(remove);
                    }
                }
                Integer num = integerArrayList.get(i);
                11T.A0A(num);
                int intValue = num.intValue();
                String str2 = stringArrayList.get(i);
                11T.A0A(str2);
                Integer valueOf = Integer.valueOf(intValue);
                r0.A04.put(valueOf, str2);
                map.put(str2, valueOf);
            }
        }
    }

    public static /* synthetic */ void A1B(ComponentActivity componentActivity, 07Z r302, Lifecycle.Event event) {
        11T.A0F(r302, 0);
        11T.A0F(event, 3);
        if (event == Lifecycle.Event.ON_CREATE) {
            r302.A05(C08i.A00(componentActivity));
        }
    }

    public static /* synthetic */ void A1C(ComponentActivity componentActivity, Lifecycle.Event event) {
        11T.A0F(event, 2);
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.A01 = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().clear();
            }
            componentActivity.reportFullyDrawnExecutor.A41();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1D(final 07Z r302) {
        getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: X.07g
            public final /* synthetic */ ComponentActivity A00;

            {
                this.A00 = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                ComponentActivity.A1B(this.A00, r302, event);
            }
        });
    }

    public Krt A1E() {
        return (Krt) this.fullyDrawnReporter$delegate.getValue();
    }

    public final void A2U(06Q r302) {
        AnonymousClass063 anonymousClass063 = this.contextAwareHelper;
        Context context = anonymousClass063.A01;
        if (context != null) {
            r302.BrN(context);
        }
        anonymousClass063.A00.add(r302);
    }

    public final void A2V(C06i c06i) {
        this.onNewIntentListeners.add(c06i);
    }

    @Override // X.C05u
    public void A6Q(C06k c06k) {
        11T.A0F(c06k, 0);
        AnonymousClass066 anonymousClass066 = this.menuHostHelper;
        anonymousClass066.A02.add(c06k);
        anonymousClass066.A00.run();
    }

    @Override // X.C1ei
    public final void A6e(C06i c06i) {
        11T.A0F(c06i, 0);
        this.onConfigurationChangedListeners.add(c06i);
    }

    @Override // X.C1ej
    public final void A6n(C06i c06i) {
        11T.A0F(c06i, 0);
        this.onMultiWindowModeChangedListeners.add(c06i);
    }

    @Override // X.C1ek
    public final void A6o(C06i c06i) {
        11T.A0F(c06i, 0);
        this.onPictureInPictureModeChangedListeners.add(c06i);
    }

    @Override // X.C1el
    public final void A6v(C06i c06i) {
        11T.A0F(c06i, 0);
        this.onTrimMemoryListeners.add(c06i);
    }

    @Override // X.C05t
    public final 06D AVc() {
        return this.activityResultRegistry;
    }

    @Override // X.C05v
    public final 07Z B03() {
        return (07Z) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // X.C05u
    public void Cef(C06k c06k) {
        11T.A0F(c06k, 0);
        AnonymousClass066 anonymousClass066 = this.menuHostHelper;
        anonymousClass066.A02.remove(c06k);
        anonymousClass066.A01.remove(c06k);
        anonymousClass066.A00.run();
    }

    @Override // X.C1ei
    public final void Cej(C06i c06i) {
        11T.A0F(c06i, 0);
        this.onConfigurationChangedListeners.remove(c06i);
    }

    @Override // X.C1ej
    public final void Cen(C06i c06i) {
        11T.A0F(c06i, 0);
        this.onMultiWindowModeChangedListeners.remove(c06i);
    }

    @Override // X.C1ek
    public final void Ceo(C06i c06i) {
        11T.A0F(c06i, 0);
        this.onPictureInPictureModeChangedListeners.remove(c06i);
    }

    @Override // X.C1el
    public final void Ces(C06i c06i) {
        11T.A0F(c06i, 0);
        this.onTrimMemoryListeners.remove(c06i);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A15();
        06A r0 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        11T.A0A(decorView);
        r0.D91(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public C1j9 getDefaultViewModelCreationExtras() {
        Bundle extras;
        C1j9 c1j9 = new 1jB((C1j9) null, (DefaultConstructorMarker) null, 1);
        if (getApplication() != null) {
            C1ew c1ew = ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY;
            Application application = getApplication();
            11T.A0A(application);
            c1j9.A01(c1ew, application);
        }
        c1j9.A01(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        c1j9.A01(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            c1j9.A01(SavedStateHandleSupport.DEFAULT_ARGS_KEY, extras);
        }
        return c1j9;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override // X.C05s
    public final AnonymousClass068 getSavedStateRegistry() {
        return this.savedStateRegistryController.A01;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw AnonymousClass001.A0N("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        A16();
        ViewModelStore viewModelStore = this._viewModelStore;
        11T.A0D(viewModelStore);
        return viewModelStore;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.A05(intent, i, i2)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        B03().A04();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        Iterator it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            ((C06i) it.next()).accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = 0FI.A00(950917542);
        this.savedStateRegistryController.A01(bundle);
        AnonymousClass063 anonymousClass063 = this.contextAwareHelper;
        anonymousClass063.A01 = this;
        Iterator it = anonymousClass063.A00.iterator();
        while (it.hasNext()) {
            ((06Q) it.next()).BrN(this);
        }
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
        int i = this.contentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
        0FI.A07(-1508650169, A00);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        11T.A0F(menu, 1);
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            this.menuHostHelper.A01(menu, getMenuInflater());
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean z = true;
        11T.A0F(menuItem, 1);
        if (!super.onMenuItemSelected(i, menuItem)) {
            if (i != 0) {
                return false;
            }
            z = this.menuHostHelper.A02(menuItem);
        }
        return z;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            ((C06i) it.next()).accept(new 9fD(z));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        11T.A0F(configuration, 1);
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((C06i) it.next()).accept(new 9fD(z, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        11T.A0F(intent, 0);
        super.onNewIntent(intent);
        Iterator it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            ((C06i) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        11T.A0F(menu, 1);
        Iterator it = this.menuHostHelper.A02.iterator();
        while (it.hasNext()) {
            ((C06j) ((C06k) it.next())).A00.A13(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            ((C06i) it.next()).accept(new C9gy(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        11T.A0F(configuration, 1);
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((C06i) it.next()).accept(new C9gy(z, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        11T.A0F(menu, 2);
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.menuHostHelper.A00(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        11T.A0F(strArr, 1);
        11T.A0F(iArr, 2);
        if (this.activityResultRegistry.A05(new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr), i, -1)) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.07j, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null) {
            C07j c07j = (C07j) getLastNonConfigurationInstance();
            if (c07j == null) {
                return null;
            }
            viewModelStore = c07j.A00;
            if (viewModelStore == null) {
                return null;
            }
        }
        ?? obj = new Object();
        obj.A00 = viewModelStore;
        return obj;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            11T.A0I(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.A02(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            ((C06i) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // X.C05w
    public final AnonymousClass088 registerForActivityResult(C07q c07q, C07r c07r) {
        06D r0 = this.activityResultRegistry;
        11T.A0F(r0, 1);
        return r0.A01(c07r, c07q, this, 0Pz.A0T("activity_rq#", this.nextLocalRequestCode.getAndIncrement()));
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (0V0.A01()) {
                0V0.A00("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            A1E().A00();
        } finally {
            0V1.A00();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        A15();
        06A r0 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        11T.A0A(decorView);
        r0.D91(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        A15();
        06A r0 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        11T.A0A(decorView);
        r0.D91(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A15();
        06A r0 = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        11T.A0A(decorView);
        r0.D91(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        11T.A0F(intent, 0);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        11T.A0F(intent, 0);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        11T.A0F(intentSender, 0);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        11T.A0F(intentSender, 0);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
