package com.facebook.tigon.tigonobserver;

import com.facebook.tigon.TigonError;

/* loaded from: TigonRequestErrored.class */
public interface TigonRequestErrored extends TigonRequestSucceeded {
    TigonError error();
}
