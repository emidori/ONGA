package com.emidori.onga;

import android.widget.MediaController;
import android.content.Context;

/**
 * Extension to MediaController
 * This class can be further tailored to create more extensions.
 *
 * Current Function: Stops the music player control panel from automatically hiding after three
 * seconds by overriding the hide method.
 *
 * Tip: You may need to tweak the theme your app uses in order to ensure that the media controller
 *      text is clearly visible.
 */
public class MusicController extends MediaController {

    public MusicController (Context c){
        super(c);
    }

    public void hide(){}
}
