package lk.ijse.greenshowspringbootbackend.dto.impl;

import lk.ijse.greenshowspringbootbackend.dto.EquipmentStatus;
import lk.ijse.greenshowspringbootbackend.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EquipmentDTO implements SuperDTO, EquipmentStatus {
    private String equipmentId;
    private String availableCount;
    private String name;
    private String type;
    private String status;
    private String fieldCode;
    private String staffId;

    public EquipmentDTO(String name, String abCount, String type,String status ,String fieldCode, String staffId) {
        this.name = name;
        this.availableCount = abCount;
        this.type = type;
        this.status = status;
        this.fieldCode = fieldCode;
        this.staffId = staffId;
    }
}
