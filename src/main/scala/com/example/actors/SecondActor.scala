package com.example.actors

import akka.actor.{Props, ActorRef, Actor}

object SecondActor {
  def props(actorRef: ActorRef): Props = Props(classOf[SecondActor], actorRef)
}

class SecondActor(val actorRef: ActorRef) extends Actor {
  override def receive: Receive = {
    case a =>
      actorRef ! a
  }
}
