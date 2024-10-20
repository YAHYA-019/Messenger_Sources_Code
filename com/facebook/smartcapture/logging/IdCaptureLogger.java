package com.facebook.smartcapture.logging;

import X.11T;
import com.facebook.smartcapture.logging.SCEventNames;

/* loaded from: IdCaptureLogger.class */
public final class IdCaptureLogger extends BaseLogger {
    public IdCaptureLogger(SmartCaptureLogger smartCaptureLogger) {
        super(smartCaptureLogger);
    }

    public final void logButtonClick(IdCaptureButton idCaptureButton) {
        11T.A0F(idCaptureButton, 0);
        logButtonClick(idCaptureButton.getText());
    }

    public final void logStepChange(IdCaptureStep idCaptureStep, IdCaptureStep idCaptureStep2) {
        11T.A0F(idCaptureStep, 0);
        11T.A0F(idCaptureStep2, 1);
        setCurrentScreen(idCaptureStep2.getText());
        logEvent(SCEventNames.STEP_CHANGE, BaseLogger.Companion.buildMap(new Object[]{SCEventNames.Params.STEP_CHANGE_PREVIOUS, idCaptureStep.getText(), SCEventNames.Params.STEP_CHANGE_NEXT, idCaptureStep2.getText()}));
    }
}
