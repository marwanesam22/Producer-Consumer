package com.producer_consumer.controllers;

import com.producer_consumer.DTOs.Dto;
import com.producer_consumer.models.Element;
import com.producer_consumer.models.Machine;
import com.producer_consumer.models.Queue;

import java.util.concurrent.TimeUnit;

public class objectFactory {
    public static Element getObject(Dto dto){
        switch (dto.type){
            case "machine":
                //machineBuilder = MachineBuilder(dto)
                //return machineBuilder.build()
                int min = 3;
                int max = 8;
                int randomtime = (int)Math.floor(Math.random() *(max - min + 1) + min);
                return new Machine(dto,randomtime);

            case "queue":
                //queueBuilder = queueBuilder(dto)
                //return queueBuilder.build()
                return new Queue(dto);
            default: return null;
        }
    }
}
