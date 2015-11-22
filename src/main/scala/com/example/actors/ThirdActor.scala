package com.example.actors

import akka.actor.Actor

class ThirdActor extends Actor {
  override def receive: Receive = {
    case a =>
      println(a)
  }
}
