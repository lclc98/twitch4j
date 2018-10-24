package com.github.twitch4j.chat.events.channel;

import com.github.twitch4j.chat.domain.ChatChannel;
import com.github.twitch4j.chat.domain.ChatUser;
import com.github.twitch4j.chat.events.AbstractChannelEvent;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Value;

/**
 * This event gets called when a client joins a channel.
 */
@Value
@Getter
@EqualsAndHashCode(callSuper = false)
public class ChannelJoinEvent extends AbstractChannelEvent {

	/**
	 * User
	 */
	private ChatUser user;

	/**
	 * Event Constructor
	 *
	 * @param channel     The channel that this event originates from.
	 * @param user        The user triggering the event.
	 */
	public ChannelJoinEvent(ChatChannel channel, ChatUser user) {
		super(channel);
		this.user = user;
	}
}