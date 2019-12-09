# Ping
Pings IP address. Works like the CMD ping

## Description

This program pings an IP address. 

## How does Ping work?

Ping comes from a term used in sonar technology that sends out pulses of sound, and then listens for the echo to return. On a computer network, a ping tool is built into most operating systems that works in much the same way. You issue the ping command along with a specific URL or IP address. Your computer sends several packets of information out to that device, and then waits for a response. When it gets the response, the ping tool shows you how long each packet took to make the round trip—or tells you there was no reply.

It sounds simple, and it is. But you can use it to good effect. You can test whether your computer can reach another device—like your router—on your local network, or whether it can reach a device on the Internet. This can help you determine if a network problem is somewhere on your local network, or somewhere beyond. The time it takes packets to return to you can help you identify a slow connection, or if you’re experiencing packet loss.

## How to Ping an IP Address using the command prompt on windows?

In Windows, hit Windows+R. In the Run window, type “cmd” into the search box, and then hit Enter.

At the prompt, type “ping” along with the URL or IP address you want to ping, and then hit Enter. In the image below, we’re pinging www.howtogeek.com and getting a normal response.

That response shows the URL you’re pinging, the IP address associated with that URL, and the size of the packets being sent on the first line. The next four lines show the replies from each individual packet, including the time (in milliseconds) it took for the response and the time-to-live (TTL) of the packet, which is the amount of time that must pass before the packet is discarded.

At the bottom, you’ll see a summary that shows how many packets were sent and received, as well as the minimum, maximum, and average response time.

And in the next image, we’re pinging the router on our local network using its IP address. We’re also getting a normal response from it.

When the ping tool does not get a response from whatever devices you’re pinging, it lets you know that, too.

And that’s how to use ping at its most basic. Of course, like most commands, there are some advanced switches you can use to make it behave a bit differently. For example, you can have it keep pinging a destination until you stop the command, specify the number of times you want it to ping, set how often it should ping, and more. But unless you’re doing some very specific types of troubleshooting, you won’t need to worry much about those advanced switches.

## Usage

This program eliminates typing the word "ping" on the command prompt. Hint: store panel's IP address in a document and read the document using a File Reader program. Instead of an IP address input, just input the name of the panel and it will ping it. 
