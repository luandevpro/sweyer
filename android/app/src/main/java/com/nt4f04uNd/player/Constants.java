package com.nt4f04uNd.player;

public class Constants {
   public static final String LogTag = "com.nt4f04und.player";

   public static final String AUDIO_FOCUS_CHANNEL = "AUDIO_FOCUS_CHANNEL";
   public static final String EVENT_CHANNEL_STREAM = "EVENT_CHANNEL_STREAM";
   public static final String GENERAL_CHANNEL_STREAM = "GENERAL_CHANNEL_STREAM";
   public static final String MEDIABUTTON_CHANNEL_STREAM = "MEDIABUTTON_CHANNEL_STREAM";
   public static final String NOTIFICATION_CHANNEL_STREAM = "NOTIFICATION_CHANNEL_STREAM";
   public static final String PLAYER_CHANNEL_STREAM = "PLAYER_CHANNEL_STREAM";
   public static final String SONGS_CHANNEL_STREAM = "SONGS_CHANNEL_STREAM";

   // Audiofocus methods
   public static final String AUDIOFOCUS_METHOD_REQUEST_FOCUS = "AUDIOFOCUS_METHOD_REQUEST_FOCUS";
   public static final String AUDIOFOCUS_METHOD_REQUEST_FOCUS_RETURN_AUDIOFOCUS_REQUEST_FAILED = "AUDIOFOCUS_METHOD_REQUEST_FOCUS_RETURN_AUDIOFOCUS_REQUEST_FAILED";
   public static final String AUDIOFOCUS_METHOD_REQUEST_FOCUS_RETURN_AUDIOFOCUS_REQUEST_GRANTED = "AUDIOFOCUS_METHOD_REQUEST_FOCUS_RETURN_AUDIOFOCUS_REQUEST_GRANTED";
   public static final String AUDIOFOCUS_METHOD_REQUEST_FOCUS_RETURN_AUDIOFOCUS_REQUEST_DELAYED = "AUDIOFOCUS_METHOD_REQUEST_FOCUS_RETURN_AUDIOFOCUS_REQUEST_DELAYED";

   public static final String AUDIOFOCUS_METHOD_FOCUS_CHANGE = "AUDIOFOCUS_METHOD_FOCUS_CHANGE";
   public static final String AUDIOFOCUS_METHOD_FOCUS_CHANGE_ARG_AUDIOFOCUS_GAIN = "AUDIOFOCUS_METHOD_FOCUS_CHANGE_ARG_AUDIOFOCUS_GAIN";
   public static final String AUDIOFOCUS_METHOD_FOCUS_CHANGE_ARG_AUDIOFOCUS_LOSS = "AUDIOFOCUS_METHOD_FOCUS_CHANGE_ARG_AUDIOFOCUS_LOSS";
   public static final String AUDIOFOCUS_METHOD_FOCUS_CHANGE_ARG_AUDIOFOCUS_LOSS_TRANSIENT = "AUDIOFOCUS_METHOD_FOCUS_CHANGE_ARG_AUDIOFOCUS_LOSS_TRANSIENT";
   public static final String AUDIOFOCUS_METHOD_FOCUS_CHANGE_ARG_AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = "AUDIOFOCUS_METHOD_FOCUS_CHANGE_ARG_AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";

   public static final String AUDIOFOCUS_METHOD_ABANDON_FOCUS = "AUDIOFOCUS_METHOD_ABANDON_FOCUS";

   // Events
   public static final String EVENT_BECOME_NOISY = "com.nt4f04uNd.player.EVENT_BECAME_NOISY";

   public static final String EVENT_NOTIFICATION_CHANNEL_ID = "com.nt4f04uNd.player.EVENT_NOTIFICATION_CHANNEL";
   public static final String EVENT_NOTIFICATION_INTENT_PLAY = "com.nt4f04uNd.player.EVENT_NOTIFICATION_PLAY";
   public static final String EVENT_NOTIFICATION_INTENT_PAUSE = "com.nt4f04uNd.player.EVENT_NOTIFICATION_PAUSE";
   public static final String EVENT_NOTIFICATION_INTENT_NEXT = "com.nt4f04uNd.player.EVENT_NOTIFICATION_NEXT";
   public static final String EVENT_NOTIFICATION_INTENT_PREV = "com.nt4f04uNd.player.EVENT_NOTIFICATION_PREV";

   // General methods
   public static final String GENERAL_METHOD_INTENT_ACTION_VIEW = "GENERAL_METHOD_INTENT_ACTION_VIEW";
   public static final String GENERAL_METHOD_KILL_ACTIVITY = "GENERAL_METHOD_KILL_ACTIVITY";

   // Media button methods
   public static final String MEDIABUTTON_METHOD_CLICK = "MEDIABUTTON_METHOD_CLICK";
   // see
   // https://developer.android.com/reference/android/view/KeyEvent.html#KEYCODE_MEDIA_AUDIO_TRACK
   // for keycodes docs
   public static final String MEDIABUTTON_METHOD_CLICK_ARG_AUDIO_TRACK = "MEDIABUTTON_METHOD_CLICK_ARG_AUDIO_TRACK";
   public static final String MEDIABUTTON_METHOD_CLICK_ARG_FAST_FORWARD = "MEDIABUTTON_METHOD_CLICK_ARG_FAST_FORWARD";
   public static final String MEDIABUTTON_METHOD_CLICK_ARG_REWIND = "MEDIABUTTON_METHOD_CLICK_ARG_REWIND";
   public static final String MEDIABUTTON_METHOD_CLICK_ARG_NEXT = "MEDIABUTTON_METHOD_CLICK_ARG_NEXT";
   public static final String MEDIABUTTON_METHOD_CLICK_ARG_PREVIOUS = "MEDIABUTTON_METHOD_CLICK_ARG_PREVIOUS";
   public static final String MEDIABUTTON_METHOD_CLICK_ARG_PLAY_PAUSE = "MEDIABUTTON_METHOD_CLICK_ARG_PLAY_PAUSE";
   public static final String MEDIABUTTON_METHOD_CLICK_ARG_PLAY = "MEDIABUTTON_METHOD_CLICK_ARG_PLAY";
   public static final String MEDIABUTTON_METHOD_CLICK_ARG_STOP = "MEDIABUTTON_METHOD_CLICK_ARG_STOP";
   public static final String MEDIABUTTON_METHOD_CLICK_ARG_HOOK = "MEDIABUTTON_METHOD_CLICK_ARG_HOOK";

   // Notification methods
   public static final String NOTIFICATION_METHOD_SHOW = "NOTIFICATION_METHOD_SHOW";
   public static final String NOTIFICATION_METHOD_SHOW_ARG_TITLE = "NOTIFICATION_METHOD_SHOW_ARG_TITLE";
   public static final String NOTIFICATION_METHOD_SHOW_ARG_ARTIST = "NOTIFICATION_METHOD_SHOW_ARG_ARTIST";
   public static final String NOTIFICATION_METHOD_SHOW_ARG_ALBUM_ART_BYTES = "NOTIFICATION_METHOD_SHOW_ARG_ALBUM_ART_BYTES";
   public static final String NOTIFICATION_METHOD_SHOW_ARG_IS_PLAYING = "NOTIFICATION_METHOD_SHOW_ARG_IS_PLAYING";

   public static final String NOTIFICATION_METHOD_CLOSE = "NOTIFICATION_METHOD_CLOSE";

   // TODO: move player methods to constants too

   // Songs methods
   public static final String SONGS_METHOD_METHOD_RETRIEVE_SONGS = "SONGS_METHOD_METHOD_RETRIEVE_SONGS";
   public static final String SONGS_METHOD_METHOD_SEND_SONGS = "SONGS_METHOD_METHOD_SEND_SONGS";
}