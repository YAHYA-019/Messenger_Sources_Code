package com.facebook.acra.anr.multisignal;

import X.04W;
import X.04Z;
import X.0EP;
import X.0Pz;
import X.0fH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04a;
import X.C04j;
import X.C04m;
import X.C0T8;
import X.C0ft;
import X.C0gi;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.acra.anr.ANRDetectorListener;
import com.facebook.acra.anr.ANRReportProvider;
import com.facebook.acra.anr.IANRDetector;
import com.facebook.acra.anr.SigquitRecord;
import com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener;
import com.facebook.acra.anr.processmonitor.ProcessAnrErrorMonitor;
import com.facebook.acra.anr.processmonitor.ProcessErrorStateListener;
import com.facebook.acra.anr.sigquit.SigquitDetector;
import com.facebook.acra.anr.sigquit.SigquitDetectorLacrima;
import com.facebook.acra.anr.sigquit.SigquitDetectorListener;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: MultiSignalANRDetector.class */
public class MultiSignalANRDetector implements SigquitDetectorListener, IANRDetector {
    public static final String MULTI_SIGNAL_DETECTOR_THREAD_NAME = "MultiSignalANRDetectorThread";
    public static Map sInstances = new HashMap();
    public ANRReportProvider mANRReportProvider;
    public long mANRReportTime;
    public final C04a mAnrDetectorConfig;
    public ANRDetectorListener mAnrDetectorListener;
    public final C0gi mAnrStagesListener;
    public final Runnable mConfirmationExpiredRunnable;
    public C04m mCurrentState;
    public long mDetectorStartTime;
    public 0EP mDurationHistoryAtSigquitTime;
    public 0EP mDurationHistoryAtTracesAvailableTime;
    public int mErrorCheckCounter;
    public final ProcessErrorStateListener mErrorMonitorListener;
    public final C04j mForegroundTransitionListener;
    public boolean mHasPendingReport;
    public long mLastSigquitReceivedTime;
    public long mLastSigquitReceivedUptime;
    public String mLogTag;
    public long mLostErrorDetectionTime;
    public boolean mMovedToBackground;
    public boolean mNativeHookInPlace;
    public final AtomicBoolean mNativeLibraryInitialized;
    public final ConditionVariable mNativeLibraryInitializedCV;
    public volatile boolean mPaused;
    public ProcessAnrErrorMonitor mProcessAnrErrorMonitor;
    public boolean mProcessAnrErrorMonitorPaused;
    public final HandlerThread mProcessingThread;
    public final Handler mProcessingThreadHandler;
    public boolean mRunning;
    public long mSigquitCallbackTime;
    public long mSigquitCallbackUptime;
    public String mSigquitData;
    public final SigquitDetector mSigquitDetector;
    public String mSigquitFileName;
    public final AtomicReference mSigquitHook;
    public long mSigquitReceivedTime;
    public long mSigquitReceivedUptime;
    public final Object mStartStopLock;
    public boolean mStartedInForegroundV1;
    public boolean mStartedInForegroundV2;
    public String mSystemErrorMessage;
    public String mSystemErrorTag;
    public long mSystemErrorUptime;
    public final AtomicReference mTracesHook;
    public boolean mWaitingForConfirmation;
    public boolean mWaitingForMainThreadBlockedCheck;

    /* renamed from: com.facebook.acra.anr.multisignal.MultiSignalANRDetector$10, reason: invalid class name */
    /* loaded from: MultiSignalANRDetector$10.class */
    public abstract /* synthetic */ class AnonymousClass10 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$acra$anr$multisignal$MultiSignalANRDetector$Event;
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$reliability$anr$AnrState;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x00c4
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                Method dump skipped, instructions count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.AnonymousClass10.m5550clinit():void");
        }
    }

    /* loaded from: MultiSignalANRDetector$ActionOnSigquit.class */
    public enum ActionOnSigquit {
        IGNORE,
        CLEAR_CURRENT_ERROR_STATE,
        START_REPORT
    }

    /* loaded from: MultiSignalANRDetector$Event.class */
    public enum Event {
        SIGQUIT_RECEIVED,
        AM_CONFIRMED,
        AM_EXPIRED,
        MT_UNBLOCKED,
        DIALOG_DISMISSED
    }

    /* loaded from: MultiSignalANRDetector$TraceDataHook.class */
    public interface TraceDataHook {
        void handleTracesExternally(String str);
    }

    /* loaded from: MultiSignalANRDetector$TraceDataResult.class */
    public class TraceDataResult {
        public String tracesFilePath = null;
        public String errMsg = null;

        public String getErrMsg() {
            return this.errMsg;
        }

        public String getTracesFilePath() {
            return this.tracesFilePath;
        }

        public boolean setError(String str) {
            this.errMsg = str;
            this.tracesFilePath = null;
            return false;
        }

        public boolean setTracesFilePath(String str) {
            this.tracesFilePath = str;
            this.errMsg = null;
            return true;
        }
    }

    public MultiSignalANRDetector(C04a c04a, C0gi c0gi) {
        this.mLogTag = "MultiSignalANRDetector";
        this.mStartStopLock = new Object();
        this.mNativeLibraryInitialized = new AtomicBoolean(false);
        this.mNativeLibraryInitializedCV = new ConditionVariable();
        this.mSigquitHook = new AtomicReference();
        this.mTracesHook = new AtomicReference();
        this.mDurationHistoryAtSigquitTime = null;
        this.mDurationHistoryAtTracesAvailableTime = null;
        this.mConfirmationExpiredRunnable = new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.1
            @Override // java.lang.Runnable
            public void run() {
                0fH.A0n(MultiSignalANRDetector.this.mLogTag, "On confirmation expired");
                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                if (multiSignalANRDetector.mWaitingForConfirmation) {
                    multiSignalANRDetector.setCurrentAnrState(Event.AM_EXPIRED);
                    MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                    multiSignalANRDetector2.mWaitingForConfirmation = false;
                    if (multiSignalANRDetector2.mHasPendingReport) {
                        04W r0 = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                        r0.A03 = SystemClock.uptimeMillis();
                        04W.A00(r0);
                    }
                    MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
                    if (multiSignalANRDetector3.isCurrentStateNoAnrDetected()) {
                        multiSignalANRDetector3.errorCleared();
                    }
                }
            }
        };
        this.mErrorMonitorListener = new DefaultProcessErrorStateListener() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2
            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onCheckFailed() {
                0fH.A0k(MultiSignalANRDetector.this.mLogTag, "onCheckFailed");
                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                multiSignalANRDetector.mLostErrorDetectionTime = SystemClock.uptimeMillis();
                multiSignalANRDetector.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector2.mHasPendingReport) {
                            04W r0 = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                            r0.A09 = multiSignalANRDetector2.mLostErrorDetectionTime;
                            r0.A01 = 3;
                            04W.A00(r0);
                        }
                    }
                });
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onCheckPerformed() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector.mMovedToBackground) {
                            MultiSignalANRDetector.access$1912(multiSignalANRDetector, 1);
                            if (multiSignalANRDetector.mErrorCheckCounter % 5 == 0) {
                                0fH.A0n(multiSignalANRDetector.mLogTag, "Pausing error state checks");
                                MultiSignalANRDetector.this.mProcessAnrErrorMonitor.pause();
                                MultiSignalANRDetector.this.mProcessAnrErrorMonitorPaused = true;
                            }
                        }
                    }
                });
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onErrorCleared() {
                0fH.A0n(MultiSignalANRDetector.this.mLogTag, "On onErrorCleared");
                C0gi c0gi2 = MultiSignalANRDetector.this.mAnrStagesListener;
                if (c0gi2 != null) {
                    c0gi2.CE0();
                }
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector.this.setCurrentAnrState(Event.DIALOG_DISMISSED);
                        MultiSignalANRDetector.this.errorCleared();
                    }
                });
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public boolean onErrorDetectOnOtherProcess(final String str, final String str2, final String str3) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector.mHasPendingReport) {
                            04W r0 = multiSignalANRDetector.mAnrDetectorConfig.A03;
                            String str4 = str;
                            String str5 = str2;
                            String str6 = str3;
                            long j = uptimeMillis;
                            List list = r0.A0b;
                            if (list.size() < 5) {
                                StringBuilder A0n = AnonymousClass001.A0n(str4);
                                A0n.append(',');
                                A0n.append(j);
                                A0n.append(',');
                                A0n.append(str5);
                                A0n.append(',');
                                list.add(AnonymousClass001.A0d(str6, A0n));
                                04W.A00(r0);
                            }
                        }
                    }
                });
                return true;
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onErrorDetected(final String str, final String str2) {
                0fH.A17(MultiSignalANRDetector.this.mLogTag, "On error detected %s %s", new Object[]{str, str2});
                synchronized (MultiSignalANRDetector.this.mStartStopLock) {
                    if (MultiSignalANRDetector.this.mRunning) {
                        C0gi c0gi2 = MultiSignalANRDetector.this.mAnrStagesListener;
                        if (c0gi2 != null) {
                            c0gi2.CDz();
                        }
                        MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                                0fH.A17(multiSignalANRDetector.mLogTag, "On error detected waiting for confirmation %b", new Object[]{Boolean.valueOf(multiSignalANRDetector.mWaitingForConfirmation)});
                                MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                                multiSignalANRDetector2.mSystemErrorMessage = str;
                                multiSignalANRDetector2.mSystemErrorTag = str2;
                                multiSignalANRDetector2.mSystemErrorUptime = SystemClock.uptimeMillis();
                                Event event = Event.AM_CONFIRMED;
                                multiSignalANRDetector2.setCurrentAnrState(event);
                                MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
                                if (multiSignalANRDetector3.mWaitingForConfirmation) {
                                    multiSignalANRDetector3.mProcessingThreadHandler.removeCallbacks(multiSignalANRDetector3.mConfirmationExpiredRunnable);
                                    multiSignalANRDetector3 = MultiSignalANRDetector.this;
                                    multiSignalANRDetector3.mWaitingForConfirmation = false;
                                }
                                multiSignalANRDetector3.maybeStartReport(event);
                            }
                        });
                    }
                }
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onStart() {
                0fH.A0n(MultiSignalANRDetector.this.mLogTag, "Started monitoring");
            }
        };
        this.mForegroundTransitionListener = new C04j() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3
            @Override // X.C04j
            public void onBackground() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        0fH.A0n(MultiSignalANRDetector.this.mLogTag, "Moving to background");
                        MultiSignalANRDetector.this.mMovedToBackground = true;
                    }
                });
            }

            @Override // X.C04j
            public void onForeground() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        multiSignalANRDetector.mMovedToBackground = false;
                        if (multiSignalANRDetector.mProcessAnrErrorMonitorPaused) {
                            0fH.A0n(multiSignalANRDetector.mLogTag, "Resuming error state checks");
                            MultiSignalANRDetector.this.mProcessAnrErrorMonitor.resume();
                            MultiSignalANRDetector.this.mProcessAnrErrorMonitorPaused = false;
                        }
                    }
                });
            }
        };
        this.mAnrDetectorConfig = c04a;
        this.mSigquitDetector = SigquitDetectorLacrima.getInstance(this);
        this.mCurrentState = C04m.A04;
        this.mProcessAnrErrorMonitor = new ProcessAnrErrorMonitor(c04a.A01, c04a.A04, false, 500, true, 0, 0, 0);
        this.mAnrStagesListener = c0gi;
        HandlerThread handlerThread = new HandlerThread(0Pz.A0W("MultiSignalANRDetectorThread:", C0ft.A02()));
        C0T8.A00(handlerThread);
        this.mProcessingThread = handlerThread;
        handlerThread.start();
        this.mProcessingThreadHandler = new Handler(handlerThread.getLooper());
    }

    public MultiSignalANRDetector(C04a c04a, SigquitDetector sigquitDetector, HandlerThread handlerThread) {
        this.mLogTag = "MultiSignalANRDetector";
        this.mStartStopLock = AnonymousClass001.A0R();
        this.mNativeLibraryInitialized = new AtomicBoolean(false);
        this.mNativeLibraryInitializedCV = new ConditionVariable();
        this.mSigquitHook = new AtomicReference();
        this.mTracesHook = new AtomicReference();
        this.mDurationHistoryAtSigquitTime = null;
        this.mDurationHistoryAtTracesAvailableTime = null;
        this.mConfirmationExpiredRunnable = new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.1
            @Override // java.lang.Runnable
            public void run() {
                0fH.A0n(MultiSignalANRDetector.this.mLogTag, "On confirmation expired");
                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                if (multiSignalANRDetector.mWaitingForConfirmation) {
                    multiSignalANRDetector.setCurrentAnrState(Event.AM_EXPIRED);
                    MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                    multiSignalANRDetector2.mWaitingForConfirmation = false;
                    if (multiSignalANRDetector2.mHasPendingReport) {
                        04W r0 = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                        r0.A03 = SystemClock.uptimeMillis();
                        04W.A00(r0);
                    }
                    MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
                    if (multiSignalANRDetector3.isCurrentStateNoAnrDetected()) {
                        multiSignalANRDetector3.errorCleared();
                    }
                }
            }
        };
        this.mErrorMonitorListener = new DefaultProcessErrorStateListener() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2
            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onCheckFailed() {
                0fH.A0k(MultiSignalANRDetector.this.mLogTag, "onCheckFailed");
                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                multiSignalANRDetector.mLostErrorDetectionTime = SystemClock.uptimeMillis();
                multiSignalANRDetector.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector2.mHasPendingReport) {
                            04W r0 = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                            r0.A09 = multiSignalANRDetector2.mLostErrorDetectionTime;
                            r0.A01 = 3;
                            04W.A00(r0);
                        }
                    }
                });
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onCheckPerformed() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector.mMovedToBackground) {
                            MultiSignalANRDetector.access$1912(multiSignalANRDetector, 1);
                            if (multiSignalANRDetector.mErrorCheckCounter % 5 == 0) {
                                0fH.A0n(multiSignalANRDetector.mLogTag, "Pausing error state checks");
                                MultiSignalANRDetector.this.mProcessAnrErrorMonitor.pause();
                                MultiSignalANRDetector.this.mProcessAnrErrorMonitorPaused = true;
                            }
                        }
                    }
                });
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onErrorCleared() {
                0fH.A0n(MultiSignalANRDetector.this.mLogTag, "On onErrorCleared");
                C0gi c0gi2 = MultiSignalANRDetector.this.mAnrStagesListener;
                if (c0gi2 != null) {
                    c0gi2.CE0();
                }
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector.this.setCurrentAnrState(Event.DIALOG_DISMISSED);
                        MultiSignalANRDetector.this.errorCleared();
                    }
                });
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public boolean onErrorDetectOnOtherProcess(final String str, final String str2, final String str3) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        if (multiSignalANRDetector.mHasPendingReport) {
                            04W r0 = multiSignalANRDetector.mAnrDetectorConfig.A03;
                            String str4 = str;
                            String str5 = str2;
                            String str6 = str3;
                            long j = uptimeMillis;
                            List list = r0.A0b;
                            if (list.size() < 5) {
                                StringBuilder A0n = AnonymousClass001.A0n(str4);
                                A0n.append(',');
                                A0n.append(j);
                                A0n.append(',');
                                A0n.append(str5);
                                A0n.append(',');
                                list.add(AnonymousClass001.A0d(str6, A0n));
                                04W.A00(r0);
                            }
                        }
                    }
                });
                return true;
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onErrorDetected(final String str, final String str2) {
                0fH.A17(MultiSignalANRDetector.this.mLogTag, "On error detected %s %s", new Object[]{str, str2});
                synchronized (MultiSignalANRDetector.this.mStartStopLock) {
                    if (MultiSignalANRDetector.this.mRunning) {
                        C0gi c0gi2 = MultiSignalANRDetector.this.mAnrStagesListener;
                        if (c0gi2 != null) {
                            c0gi2.CDz();
                        }
                        MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                                0fH.A17(multiSignalANRDetector.mLogTag, "On error detected waiting for confirmation %b", new Object[]{Boolean.valueOf(multiSignalANRDetector.mWaitingForConfirmation)});
                                MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                                multiSignalANRDetector2.mSystemErrorMessage = str;
                                multiSignalANRDetector2.mSystemErrorTag = str2;
                                multiSignalANRDetector2.mSystemErrorUptime = SystemClock.uptimeMillis();
                                Event event = Event.AM_CONFIRMED;
                                multiSignalANRDetector2.setCurrentAnrState(event);
                                MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
                                if (multiSignalANRDetector3.mWaitingForConfirmation) {
                                    multiSignalANRDetector3.mProcessingThreadHandler.removeCallbacks(multiSignalANRDetector3.mConfirmationExpiredRunnable);
                                    multiSignalANRDetector3 = MultiSignalANRDetector.this;
                                    multiSignalANRDetector3.mWaitingForConfirmation = false;
                                }
                                multiSignalANRDetector3.maybeStartReport(event);
                            }
                        });
                    }
                }
            }

            @Override // com.facebook.acra.anr.processmonitor.DefaultProcessErrorStateListener, com.facebook.acra.anr.processmonitor.ProcessErrorStateListener
            public void onStart() {
                0fH.A0n(MultiSignalANRDetector.this.mLogTag, "Started monitoring");
            }
        };
        this.mForegroundTransitionListener = new C04j() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3
            @Override // X.C04j
            public void onBackground() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        0fH.A0n(MultiSignalANRDetector.this.mLogTag, "Moving to background");
                        MultiSignalANRDetector.this.mMovedToBackground = true;
                    }
                });
            }

            @Override // X.C04j
            public void onForeground() {
                MultiSignalANRDetector.this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        multiSignalANRDetector.mMovedToBackground = false;
                        if (multiSignalANRDetector.mProcessAnrErrorMonitorPaused) {
                            0fH.A0n(multiSignalANRDetector.mLogTag, "Resuming error state checks");
                            MultiSignalANRDetector.this.mProcessAnrErrorMonitor.resume();
                            MultiSignalANRDetector.this.mProcessAnrErrorMonitorPaused = false;
                        }
                    }
                });
            }
        };
        this.mAnrDetectorConfig = c04a;
        this.mSigquitDetector = sigquitDetector;
        this.mCurrentState = C04m.A04;
        this.mProcessAnrErrorMonitor = new ProcessAnrErrorMonitor(c04a.A01, c04a.A04, false, 500, true, 0, 0, 0);
        this.mProcessingThread = handlerThread;
        this.mAnrStagesListener = null;
        handlerThread.start();
        this.mProcessingThreadHandler = new Handler(handlerThread.getLooper());
    }

    public static /* synthetic */ int access$1912(MultiSignalANRDetector multiSignalANRDetector, int i) {
        int i2 = multiSignalANRDetector.mErrorCheckCounter + i;
        multiSignalANRDetector.mErrorCheckCounter = i2;
        return i2;
    }

    public static /* synthetic */ boolean access$700(MultiSignalANRDetector multiSignalANRDetector) {
        return false;
    }

    private void addActivityManagerConfirmationDataToReport() {
        04W r0 = this.mAnrDetectorConfig.A03;
        String str = this.mSystemErrorMessage;
        String str2 = this.mSystemErrorTag;
        long j = this.mSystemErrorUptime;
        r0.A0O = str;
        r0.A0P = str2;
        r0.A08 = j;
        04W.A00(r0);
    }

    private void addInfoToReport(Event event) {
        if (event == Event.SIGQUIT_RECEIVED) {
            addSigquitDataToReport();
        } else {
            if (event != Event.AM_CONFIRMED) {
                throw AnonymousClass001.A0L("Event should be SIGQUIT_RECEIVED or AM_CONFIRMED");
            }
            addActivityManagerConfirmationDataToReport();
        }
    }

    private void addSigquitDataToReport() {
        04W r0 = this.mAnrDetectorConfig.A03;
        String str = this.mSigquitData;
        String str2 = this.mSigquitFileName;
        long j = this.mSigquitCallbackUptime;
        long j2 = this.mSigquitCallbackTime;
        long j3 = this.mSigquitReceivedUptime;
        long j4 = this.mSigquitReceivedTime;
        0EP r02 = this.mDurationHistoryAtSigquitTime;
        0EP r03 = this.mDurationHistoryAtTracesAvailableTime;
        r0.A0M = str;
        r0.A0N = str2;
        r0.A0Q = null;
        r0.A0V = true;
        r0.A0H = Long.valueOf(j);
        r0.A0G = Long.valueOf(j2);
        r0.A0J = Long.valueOf(j3);
        r0.A0I = Long.valueOf(j4);
        r0.A0C = r02;
        r0.A0D = r03;
        04W.A00(r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void errorCleared() {
        0fH.A17(this.mLogTag, "Clearing error state has pending report %b", new Object[]{Boolean.valueOf(this.mHasPendingReport)});
        if (this.mHasPendingReport) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.mANRReportTime;
            04W r0 = this.mAnrDetectorConfig.A03;
            r0.A0B = uptimeMillis;
            04W.A00(r0);
            r0.A0R = false;
            this.mHasPendingReport = false;
        }
        this.mSystemErrorMessage = null;
        this.mSystemErrorTag = null;
        this.mSystemErrorUptime = 0L;
        this.mSigquitReceivedUptime = 0L;
        this.mSigquitReceivedTime = 0L;
        this.mSigquitCallbackUptime = 0L;
        this.mSigquitData = null;
        this.mSigquitFileName = null;
        this.mSigquitCallbackTime = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ActionOnSigquit getActionOnSigquit() {
        C04m c04m = this.mCurrentState;
        return (c04m == C04m.A04 || c04m == C04m.A05 || c04m == C04m.A06) ? ActionOnSigquit.START_REPORT : ActionOnSigquit.IGNORE;
    }

    public static MultiSignalANRDetector getInstance(C04a c04a) {
        return getInstance(c04a, null);
    }

    public static MultiSignalANRDetector getInstance(C04a c04a, C0gi c0gi) {
        MultiSignalANRDetector multiSignalANRDetector = (MultiSignalANRDetector) sInstances.get(c04a);
        if (multiSignalANRDetector == null) {
            multiSignalANRDetector = new MultiSignalANRDetector(c04a, c0gi);
            sInstances.put(c04a, multiSignalANRDetector);
        }
        multiSignalANRDetector.mLogTag = 0Pz.A0W("MultiSignalANRDetector", "Lacrima");
        return multiSignalANRDetector;
    }

    public static MultiSignalANRDetector getTestInstance(C04a c04a, SigquitDetector sigquitDetector, HandlerThread handlerThread) {
        throw new AssertionError();
    }

    public static void getTraceDataFromHook(final TraceDataHook traceDataHook) {
        Iterator it = sInstances.values().iterator();
        if (it.hasNext()) {
            MultiSignalANRDetector multiSignalANRDetector = (MultiSignalANRDetector) it.next();
            if (multiSignalANRDetector.mNativeLibraryInitialized.get()) {
                multiSignalANRDetector.triggerSigquit(traceDataHook);
            } else {
                new Thread() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.9
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector.this.mNativeLibraryInitializedCV.block();
                        MultiSignalANRDetector.this.triggerSigquit(traceDataHook);
                    }
                }.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCurrentStateNoAnrDetected() {
        boolean z = false;
        if (this.mCurrentState == C04m.A04) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == X.C04m.A0B) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isCurrentStateUnconfirmed() {
        /*
            r301 = this;
            r0 = r301
            X.04m r0 = r0.mCurrentState
            r302 = r0
            X.04m r0 = X.C04m.A0A
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            X.04m r0 = X.C04m.A0B
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L1f
        L1c:
            r0 = 1
            r305 = r0
        L1f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.isCurrentStateUnconfirmed():boolean");
    }

    private boolean isDebuggerConnected() {
        return false;
    }

    public static boolean isTest() {
        return false;
    }

    private void logUnexpectedStateTransition(Event event) {
        ANRReportProvider aNRReportProvider;
        0fH.A17(this.mLogTag, "Unexpected event %s received in state %s", new Object[]{event, this.mCurrentState});
        if (event == Event.SIGQUIT_RECEIVED || (aNRReportProvider = this.mANRReportProvider) == null) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Unexpected event ");
        A0k.append(event);
        A0k.append(" received in state ");
        aNRReportProvider.reportSoftError("Unexpected event", AnonymousClass002.A0E(this.mCurrentState, A0k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mainThreadUnblocked() {
        0fH.A0n(this.mLogTag, "Running on the main thread");
        final long uptimeMillis = SystemClock.uptimeMillis();
        this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.8
            @Override // java.lang.Runnable
            public void run() {
                MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                multiSignalANRDetector.mWaitingForMainThreadBlockedCheck = false;
                multiSignalANRDetector.setCurrentAnrState(Event.MT_UNBLOCKED);
                MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                if (multiSignalANRDetector2.mHasPendingReport) {
                    04W r0 = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                    r0.A07 = uptimeMillis;
                    04W.A00(r0);
                }
                MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
                if (multiSignalANRDetector3.isCurrentStateNoAnrDetected()) {
                    multiSignalANRDetector3.errorCleared();
                }
            }
        });
    }

    private void maybeStartMainThreadBlockedCheck() {
        if (this.mWaitingForMainThreadBlockedCheck) {
            return;
        }
        C04m c04m = this.mCurrentState;
        if (c04m == C04m.A0A || c04m == C04m.A05) {
            0fH.A0n(this.mLogTag, "Posting main thread check");
            this.mWaitingForMainThreadBlockedCheck = true;
            this.mAnrDetectorConfig.A02.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.7
                @Override // java.lang.Runnable
                public void run() {
                    MultiSignalANRDetector.this.mainThreadUnblocked();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeStartReport(Event event) {
        String str;
        0fH.A17(this.mLogTag, "On maybeStartReport event: %s has pending report %b", new Object[]{event, Boolean.valueOf(this.mHasPendingReport)});
        if (this.mHasPendingReport) {
            addInfoToReport(event);
            return;
        }
        if (this.mStartedInForegroundV2 || this.mStartedInForegroundV1) {
            boolean shouldUploadAnrReports = shouldUploadAnrReports();
            maybeStartTimerForActivityManagerConfirmation();
            if (shouldUploadAnrReports) {
                0fH.A0n(this.mLogTag, "Reporting ANR start");
                try {
                    startReport(event);
                    return;
                } catch (IOException e) {
                    0fH.A0s(this.mLogTag, "Error starting ANR report", e);
                    this.mHasPendingReport = false;
                    return;
                }
            }
            04W r0 = this.mAnrDetectorConfig.A03;
            boolean z = this.mStartedInForegroundV1;
            boolean z2 = this.mStartedInForegroundV2;
            r0.A0S = z;
            r0.A0T = z2;
            04W.A00(r0);
        }
        if (event != Event.SIGQUIT_RECEIVED || (str = this.mSigquitFileName) == null) {
            return;
        }
        AnonymousClass001.A0E(str).delete();
    }

    private void maybeStartTimerForActivityManagerConfirmation() {
        if (this.mWaitingForConfirmation || !isCurrentStateUnconfirmed()) {
            return;
        }
        0fH.A0n(this.mLogTag, "Starting timer for AM confirmation");
        this.mWaitingForConfirmation = true;
        this.mProcessingThreadHandler.postDelayed(this.mConfirmationExpiredRunnable, LocationComponentOptions.STALE_STATE_DELAY_MS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (r0 == X.C04m.A05) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setASLState(com.facebook.acra.anr.multisignal.MultiSignalANRDetector.Event r302, boolean r303, boolean r304) {
        /*
            r301 = this;
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector$Event r0 = com.facebook.acra.anr.multisignal.MultiSignalANRDetector.Event.SIGQUIT_RECEIVED
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            r1 = r305
            if (r0 != r1) goto L11
            r0 = 1
            r306 = r0
        L11:
            r0 = r301
            X.04a r0 = r0.mAnrDetectorConfig
            r305 = r0
            r0 = r305
            X.04Z r0 = r0.A00
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = r306
            if (r0 == 0) goto L31
            com.facebook.acra.anr.multisignal.MultiSignalANRDetector$6 r0 = new com.facebook.acra.anr.multisignal.MultiSignalANRDetector$6
            r308 = r0
            r0 = r308
            r1 = r301
            r0.<init>()
        L31:
            r0 = r301
            X.04m r0 = r0.mCurrentState
            r309 = r0
            X.04m r0 = X.C04m.A0A
            r305 = r0
            r0 = r309
            r1 = r305
            if (r0 == r1) goto L52
            X.04m r0 = X.C04m.A05
            r305 = r0
            r0 = 0
            r310 = r0
            r0 = r309
            r1 = r305
            if (r0 != r1) goto L55
        L52:
            r0 = 1
            r310 = r0
        L55:
            r0 = r306
            if (r0 == 0) goto L89
            r0 = r310
            if (r0 == 0) goto L89
            r0 = r307
            X.04Y r0 = (X.C04Y) r0
            r307 = r0
            r0 = r307
            X.0Dm r0 = r0.A00
            r305 = r0
            r0 = r305
            r1 = r309
            X.0Dm.A01(r0, r1)
            r0 = r308
            if (r0 == 0) goto L7e
            r0 = r308
            r0.run()
        L7e:
            r0 = r301
            r1 = r303
            r0.mStartedInForegroundV1 = r1
            r0 = r301
            r1 = r304
            r0.mStartedInForegroundV2 = r1
        L88:
            return
        L89:
            boolean r0 = X.C0ft.A09()
            r304 = r0
            X.0o7 r0 = X.C0ft.A04
            r305 = r0
            r0 = r305
            if (r0 != 0) goto Lc6
            r0 = 0
            r303 = r0
        L99:
            r0 = r301
            X.04m r0 = r0.mCurrentState
            r309 = r0
            r0 = r307
            X.04Y r0 = (X.C04Y) r0
            r307 = r0
            r0 = r307
            X.0Dm r0 = r0.A00
            r305 = r0
            r0 = r305
            r1 = r309
            X.0Dm.A01(r0, r1)
            r0 = r308
            if (r0 == 0) goto Lbe
            r0 = r308
            r0.run()
        Lbe:
            r0 = r310
            if (r0 == 0) goto L88
            goto L7e
        Lc6:
            X.0o7 r0 = X.C0ft.A04
            r305 = r0
            r0 = r305
            boolean r0 = r0.A06
            r303 = r0
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.setASLState(com.facebook.acra.anr.multisignal.MultiSignalANRDetector$Event, boolean, boolean):void");
    }

    private void setCurrentAnrStateFromNoAnrDetected(Event event) {
        C04m c04m;
        int ordinal = event.ordinal();
        if (ordinal == 0) {
            c04m = C04m.A0A;
        } else {
            if (ordinal != 1) {
                if (ordinal != 3) {
                    logUnexpectedStateTransition(event);
                    return;
                }
                return;
            }
            c04m = C04m.A05;
        }
        this.mCurrentState = c04m;
    }

    private void setCurrentAnrStateFromNoSigquitAmConfirmedMtBlocked(Event event) {
        C04m c04m;
        int ordinal = event.ordinal();
        if (ordinal == 0) {
            c04m = C04m.A07;
        } else if (ordinal == 3) {
            c04m = C04m.A06;
        } else {
            if (ordinal != 4) {
                logUnexpectedStateTransition(event);
                return;
            }
            c04m = C04m.A04;
        }
        this.mCurrentState = c04m;
    }

    private void setCurrentAnrStateFromNoSigquitAmConfirmedMtUnblocked(Event event) {
        C04m c04m;
        int ordinal = event.ordinal();
        if (ordinal == 0) {
            c04m = C04m.A08;
        } else {
            if (ordinal != 4) {
                logUnexpectedStateTransition(event);
                return;
            }
            c04m = C04m.A04;
        }
        this.mCurrentState = c04m;
    }

    private void setCurrentAnrStateFromSigquitReceivedAmConfirmedMtBlocked(Event event) {
        C04m c04m;
        int ordinal = event.ordinal();
        if (ordinal == 3) {
            c04m = C04m.A08;
        } else {
            if (ordinal != 4) {
                logUnexpectedStateTransition(event);
                return;
            }
            c04m = C04m.A04;
        }
        this.mCurrentState = c04m;
    }

    private void setCurrentAnrStateFromSigquitReceivedAmConfirmedMtUnblocked(Event event) {
        if (event.ordinal() != 4) {
            logUnexpectedStateTransition(event);
        } else {
            this.mCurrentState = C04m.A04;
        }
    }

    private void setCurrentAnrStateFromSigquitReceivedAmExpiredMtBlocked(Event event) {
        C04m c04m;
        int ordinal = event.ordinal();
        if (ordinal == 0) {
            c04m = C04m.A0A;
        } else if (ordinal == 1) {
            c04m = C04m.A07;
        } else {
            if (ordinal != 3) {
                logUnexpectedStateTransition(event);
                return;
            }
            c04m = C04m.A04;
        }
        this.mCurrentState = c04m;
    }

    private void setCurrentAnrStateFromSigquitReceivedAmUnconfirmedMtBlocked(Event event) {
        C04m c04m;
        int ordinal = event.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c04m = C04m.A07;
            } else if (ordinal == 3) {
                c04m = C04m.A0B;
            } else {
                if (ordinal != 2) {
                    logUnexpectedStateTransition(event);
                    return;
                }
                c04m = C04m.A09;
            }
            this.mCurrentState = c04m;
        }
    }

    private void setCurrentAnrStateFromSigquitReceivedAmUnconfirmedMtUnblocked(Event event) {
        C04m c04m;
        int ordinal = event.ordinal();
        if (ordinal == 0) {
            c04m = C04m.A0A;
        } else if (ordinal == 1) {
            c04m = C04m.A08;
        } else {
            if (ordinal != 2) {
                logUnexpectedStateTransition(event);
                return;
            }
            c04m = C04m.A04;
        }
        this.mCurrentState = c04m;
    }

    private boolean shouldUploadAnrReports() {
        ANRReportProvider aNRReportProvider = this.mANRReportProvider;
        if (aNRReportProvider != null) {
            return aNRReportProvider.shouldCollectAndUploadANRReports();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void startReport(com.facebook.acra.anr.multisignal.MultiSignalANRDetector.Event r302) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.startReport(com.facebook.acra.anr.multisignal.MultiSignalANRDetector$Event):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerSigquit(TraceDataHook traceDataHook) {
        this.mSigquitHook.set(traceDataHook);
        this.mSigquitDetector.doNotIgnoreNextSiguit();
        Process.sendSignal(Process.myPid(), 3);
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public long getANRReceivedTime() {
        return this.mSigquitReceivedTime;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public long getANRReceivedUpTime() {
        return this.mSigquitReceivedUptime;
    }

    public C04m getCurrentState() {
        throw new AssertionError();
    }

    public ProcessErrorStateListener getErrorMonitorListener() {
        throw new AssertionError();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void nativeLibraryLoaded(boolean z) {
        this.mSigquitDetector.init(this.mAnrDetectorConfig, shouldUploadAnrReports());
        this.mSigquitDetector.installSignalHandler(this.mProcessingThreadHandler, z);
        this.mNativeLibraryInitialized.set(true);
        this.mNativeLibraryInitializedCV.open();
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetectorListener
    public void onHookedMethods(boolean z) {
        synchronized (this.mStartStopLock) {
            this.mNativeHookInPlace = z;
        }
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetectorListener
    public void onSigquit() {
        if (this.mPaused) {
            return;
        }
        Object andSet = this.mSigquitHook.getAndSet(null);
        if (andSet != null) {
            this.mTracesHook.set(andSet);
            return;
        }
        this.mLastSigquitReceivedUptime = SystemClock.uptimeMillis();
        this.mLastSigquitReceivedTime = System.currentTimeMillis();
        this.mDurationHistoryAtSigquitTime = this.mProcessAnrErrorMonitor.getDurationHistory();
        C0gi c0gi = this.mAnrStagesListener;
        if (c0gi != null) {
            c0gi.onSigquit();
        }
    }

    @Override // com.facebook.acra.anr.sigquit.SigquitDetectorListener
    public void onSigquitTracesAvailable(final String str, final String str2, final boolean z, final boolean z2) {
        if (this.mPaused) {
            return;
        }
        0fH.A0n(this.mLogTag, "On onSigquitTracesAvailable call");
        synchronized (this.mStartStopLock) {
            if (this.mRunning) {
                TraceDataHook traceDataHook = (TraceDataHook) this.mTracesHook.getAndSet(null);
                if (traceDataHook != null) {
                    traceDataHook.handleTracesExternally(str2);
                    return;
                }
                this.mDurationHistoryAtTracesAvailableTime = this.mProcessAnrErrorMonitor.getDurationHistory();
                C0gi c0gi = this.mAnrStagesListener;
                if (c0gi != null) {
                    c0gi.CLa();
                }
                final long uptimeMillis = SystemClock.uptimeMillis();
                final long currentTimeMillis = System.currentTimeMillis();
                this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MultiSignalANRDetector multiSignalANRDetector = MultiSignalANRDetector.this;
                        ActionOnSigquit actionOnSigquit = multiSignalANRDetector.getActionOnSigquit();
                        if (actionOnSigquit == ActionOnSigquit.IGNORE) {
                            0fH.A0n(multiSignalANRDetector.mLogTag, "Ignoring new sigquit");
                            String str3 = str2;
                            if (str3 != null) {
                                AnonymousClass001.A0E(str3).delete();
                            }
                            MultiSignalANRDetector.this.mSigquitDetector.cleanupAppStateFile();
                            MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                            if (multiSignalANRDetector2.mHasPendingReport) {
                                04W r0 = multiSignalANRDetector2.mAnrDetectorConfig.A03;
                                r0.A06 = uptimeMillis;
                                04W.A00(r0);
                                return;
                            }
                            return;
                        }
                        multiSignalANRDetector.mSigquitReceivedTime = multiSignalANRDetector.mLastSigquitReceivedTime;
                        multiSignalANRDetector.mSigquitReceivedUptime = multiSignalANRDetector.mLastSigquitReceivedUptime;
                        ActionOnSigquit actionOnSigquit2 = ActionOnSigquit.CLEAR_CURRENT_ERROR_STATE;
                        String str4 = multiSignalANRDetector.mLogTag;
                        if (actionOnSigquit == actionOnSigquit2) {
                            0fH.A0n(str4, "Will clear error state");
                            MultiSignalANRDetector.this.errorCleared();
                        } else {
                            0fH.A0n(str4, "Will start new report");
                        }
                        MultiSignalANRDetector multiSignalANRDetector3 = MultiSignalANRDetector.this;
                        multiSignalANRDetector3.mSigquitCallbackUptime = uptimeMillis;
                        multiSignalANRDetector3.mSigquitData = str;
                        multiSignalANRDetector3.mSigquitFileName = str2;
                        multiSignalANRDetector3.mSigquitCallbackTime = currentTimeMillis;
                        Event event = Event.SIGQUIT_RECEIVED;
                        multiSignalANRDetector3.setCurrentAnrState(event, z, z2);
                        SigquitRecord.updateRecords(uptimeMillis, MultiSignalANRDetector.this.mAnrDetectorConfig.A00());
                        MultiSignalANRDetector.this.maybeStartReport(event);
                    }
                });
            }
        }
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void pause() {
        this.mPaused = true;
        this.mProcessAnrErrorMonitor.pause();
        this.mSigquitDetector.stopDetector();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void resume() {
        this.mPaused = false;
        this.mProcessAnrErrorMonitor.resume();
        this.mSigquitDetector.startDetector();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setANRReportProvider(ANRReportProvider aNRReportProvider) {
        this.mANRReportProvider = aNRReportProvider;
    }

    public void setAnrErrorMonitor(ProcessAnrErrorMonitor processAnrErrorMonitor) {
        throw new AssertionError();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setCheckIntervalMs(long j) {
    }

    public void setCurrentAnrState(Event event) {
        setCurrentAnrState(event, false, false);
    }

    public void setCurrentAnrState(Event event, boolean z, boolean z2) {
        C04m c04m;
        0fH.A17(this.mLogTag, "Transitioning from %s event %s inFgV1: %b inFgV2: %b", new Object[]{this.mCurrentState, event, Boolean.valueOf(z), Boolean.valueOf(z2)});
        C04m c04m2 = this.mCurrentState;
        switch (c04m2.ordinal()) {
            case 0:
                setCurrentAnrStateFromNoAnrDetected(event);
                break;
            case 1:
            case 2:
            default:
                throw AnonymousClass001.A0N(AnonymousClass001.A0Z(c04m2, "Unknown state: ", AnonymousClass001.A0k()));
            case 3:
                setCurrentAnrStateFromSigquitReceivedAmUnconfirmedMtBlocked(event);
                break;
            case 4:
                setCurrentAnrStateFromSigquitReceivedAmConfirmedMtBlocked(event);
                break;
            case 5:
                setCurrentAnrStateFromSigquitReceivedAmConfirmedMtUnblocked(event);
                break;
            case 6:
                setCurrentAnrStateFromSigquitReceivedAmUnconfirmedMtUnblocked(event);
                break;
            case 7:
                setCurrentAnrStateFromSigquitReceivedAmExpiredMtBlocked(event);
                break;
            case 8:
                setCurrentAnrStateFromNoSigquitAmConfirmedMtBlocked(event);
                break;
            case 9:
                setCurrentAnrStateFromNoSigquitAmConfirmedMtUnblocked(event);
                break;
        }
        setASLState(event, z, z2);
        maybeStartMainThreadBlockedCheck();
        C04m c04m3 = this.mCurrentState;
        if (c04m2 == c04m3 || c04m2 == (c04m = C04m.A04) || c04m3 == c04m) {
            return;
        }
        04W r0 = this.mAnrDetectorConfig.A03;
        r0.A0E = c04m3;
        if (r0.A0R) {
            04W.A00(r0);
        }
    }

    public void setInternalState(C04m c04m) {
        throw new AssertionError();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void setListener(ANRDetectorListener aNRDetectorListener) {
        this.mAnrDetectorListener = aNRDetectorListener;
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void start() {
        synchronized (this.mStartStopLock) {
            if (!this.mRunning) {
                0fH.A0n(this.mLogTag, "Starting");
                this.mRunning = true;
                this.mDetectorStartTime = SystemClock.uptimeMillis();
                this.mProcessAnrErrorMonitor.startMonitoringAfterDelay(this.mErrorMonitorListener, 0L);
                final 04Z r0 = this.mAnrDetectorConfig.A00;
                this.mProcessingThreadHandler.post(new Runnable() { // from class: com.facebook.acra.anr.multisignal.MultiSignalANRDetector.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!C0ft.A09() && (C0ft.A04 == null || !C0ft.A04.A06)) {
                            MultiSignalANRDetector.this.mMovedToBackground = true;
                        }
                        04Z r02 = r0;
                        C04j c04j = MultiSignalANRDetector.this.mForegroundTransitionListener;
                        List list = r02.A00;
                        synchronized (list) {
                            list.add(c04j);
                        }
                    }
                });
            }
        }
    }

    public void startForTesting() {
        throw new AssertionError();
    }

    @Override // com.facebook.acra.anr.IANRDetector
    public void stop(IANRDetector.ANRDetectorStopListener aNRDetectorStopListener) {
        synchronized (this.mStartStopLock) {
            if (this.mRunning) {
                0fH.A0n(this.mLogTag, "Stopping");
                this.mRunning = false;
                this.mProcessAnrErrorMonitor.stopMonitoring();
                this.mProcessingThreadHandler.removeCallbacks(this.mConfirmationExpiredRunnable);
                if (this.mNativeHookInPlace) {
                    this.mSigquitDetector.stopDetector();
                }
                04Z r0 = this.mAnrDetectorConfig.A00;
                C04j c04j = this.mForegroundTransitionListener;
                List list = r0.A00;
                synchronized (list) {
                    list.remove(c04j);
                }
                if (aNRDetectorStopListener != null) {
                    aNRDetectorStopListener.onStop();
                }
            }
        }
    }
}
