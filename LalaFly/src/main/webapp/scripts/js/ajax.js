/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function refreshAeropuertoList() {
                var custList = $('#selASalida');
                custList.empty();
                $.ajax({
                    "url": "webresources/aeropuerto",
                    "type": "get",
                    "dataType": "json",
                    "success": function (aeropuerto) {
                       console.log(aeropuerto);
                       var aux = aeropuerto;
                        $.each(aeropuerto, function (index) {
                            var options = $('<option/>')
                                    .addClass('ui-menu-item')
                                    .attr('role', 'menuitem')
                                    .attr("value",aux[index].idAeropuerto)
                                    .text(aux[index].nombre)
                                    .appendTo(custList);
                                    
//                            var a = $('<a/>')
//                                    .addClass('ui-all')
//                                    .text(aeropuerto.nombre)
//                                    .appendTo(options);
                        });
                    }
                });
            }
            function refreshAerolineaList() {
                var custList = $('#selectAerolinea');
                custList.empty();
                $.ajax({
                    "url": "webresources/aerolinea",
                    "type": "get",
                    "dataType": "json",
                    "success": function (aerolinea) {
                       console.log(aerolinea);
                       var aux = aerolinea;
                        $.each(aerolinea, function (index) {
                            var options = $('<option/>')
                                    .addClass('ui-menu-item')
                                    .attr('role', 'menuitem')
                                    .attr("value",aux[index].idAerolinea)
                                    .text(aux[index].nombre)
                                    .appendTo(custList);
                                    
//                            var a = $('<a/>')
//                                    .addClass('ui-all')
//                                    .text(aeropuerto.nombre)
//                                    .appendTo(options);
                        });
                    }
                });
            }


