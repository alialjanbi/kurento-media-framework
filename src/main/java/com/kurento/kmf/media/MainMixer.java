package com.kurento.kmf.media;

import com.kurento.kmf.media.internal.refs.MediaMixerRefDTO;
import com.kurento.kmf.media.objects.MediaMixer;

@IsMediaElement(type = "MainMixer")
public class MainMixer extends MediaMixer {

	MainMixer(MediaMixerRefDTO mainMixerId) {
		super(mainMixerId);
	}

}