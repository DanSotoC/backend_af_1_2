<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <div class="row class col-lg-6">
            <form class="form-row">
            <table class="table table-borderless " >

            <tbody >
                <tr style="background-color:#EAE4E3">
                    <td class="col-lg-1"><label for="name" >Nombre</label></td>
                    <td class="col-lg-2"><input type="text" id="name" class="form-control input-sm " placeholder=""></td>
                    <td class="col-lg-1"></td>
                </tr>
                <tr >
                    <td class="col-lg-1">  <label for="lastname">Apellido</label> </td>
                    <td class="col-lg-2"><input type="text" id="lastname" class="form-control input-sm " placeholder=""></td>
                    <td class="col-lg-1"></td>
                </tr>
                <tr  style="background-color:#EAE4E3">
                    <td class="col-lg-1">Límite</td>
                    <td class="col-lg-2"><input type="text" id="limit" class="form-control input-sm " placeholder=""></td>
                    <td class="col-lg-1"></td>
                </tr>

                    <tr >
                    <td class="col-lg-1">Código postal</td>
                    <td class="col-lg-2"><input type="text" id="postalCode" class="form-control input-sm " placeholder=""></td>
                    <td class="col-lg-2"></td>
                    </tr>
                 
                    <tr>
                        <td></td>
                        <td> <button type="submit" class="btn btn-warning">Limpiar</button> <button type="submit" class="btn btn-success">Enviar</button></td>
                    </tr>
            </tbody>




        </form>
        </div>
         

    </div>
   
    
</table>
</body>
</html>
