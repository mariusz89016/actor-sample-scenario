package com.example.actors

import akka.actor.{Props, ActorRef, Actor}

object FirstActor {
  def props(actorRef: ActorRef): Props = Props(classOf[FirstActor], actorRef)
}

class FirstActor(val actorRef: ActorRef) extends Actor {
  override def receive: Receive = {
    case a =>
      actorRef ! a
  }
}
